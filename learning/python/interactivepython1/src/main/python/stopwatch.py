import simplegui

current_stopwatch_time = 0
current_stop_attempts = 0
current_stop_attempts_ok = 0

game_is_running = False

# define helper function format that converts time
# in tenths of seconds into formatted string A:BC.D
def format(time):
    """
    Converts time from tenths of seconds to a readable text.
    Format: A:BC.D
    """
    
    minutes 	= time // 600
    remaining 	= time - minutes * 600
    
    seconds 	= remaining // 10
    miliseconds = remaining - seconds * 10 
    
    result = str(minutes) + ":"
    
    if seconds < 10:
        result += "0"+str(seconds)
    else:
        result += str(seconds)
        
    result += "." + str(miliseconds)
    
    
    return result
 

def is_a_valid_attempt():
    """
    Determines if the attempt is valid.
    An attempt is valid if the current time in the stopwatch
    is a whole seconds
    """
    
    return current_stopwatch_time % 10 == 0
    

def set_game_running(game_status):
    """
    Updates the game_is_running flag
    """
    global game_is_running
    game_is_running = game_status

def register_attempt():
    """
    Updates the game counters based on the current attempt
    """
    global current_stop_attempts
    global current_stop_attempts_ok
    
    current_stop_attempts += 1
    if is_a_valid_attempt():
        current_stop_attempts_ok += 1
        
    
#Handler definition
def stopwatch_handler():
    """
    Increments stopwatch counter
    """
    global current_stopwatch_time
    current_stopwatch_time += 1

    
def start_btn_handler():
    """
    Start button handler. 
    This handler (re)starts the stopwatch    
    """
    timer.start()
    set_game_running(True)
    
def stop_btn_handler():
    """
    Stop button handler. 
    This handler stops the stopwatch and 
    registers the attempt.
    """
    timer.stop()
    if game_is_running:
        register_attempt()
        set_game_running(False)
         

def reset_btn_handler():
    """
    Reset button handler. 
    This handler stops the stopwatch and 
    resets the game (time and attempts counters)
    """
    global current_stopwatch_time   
    global current_stop_attempts
    global current_stop_attempts_ok
    
    timer.stop()
    current_stopwatch_time	 = 0
    current_stop_attempts	 = 0
    current_stop_attempts_ok = 0
    set_game_running(False)
    
# define timer with 0.1 sec interval
timer = simplegui.create_timer(100, stopwatch_handler)   

# define draw handler
def draw(canvas):
    canvas.draw_text(format(current_stopwatch_time),
                     [150, 110], 40, "White")

    canvas.draw_text(str(current_stop_attempts_ok)+"/" +
                     str(current_stop_attempts),
                     [340,30], 30, "Green")
    
# create frame
frame = simplegui.create_frame("Stopwatch - The game", 400, 200)
frame.set_draw_handler(draw)
frame.add_button('Start', start_btn_handler, 150)
frame.add_button('Stop',  stop_btn_handler,150)
frame.add_button('Reset', reset_btn_handler,150)

# start frame
frame.start()

