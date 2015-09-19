import simplegui
import random
import math

secret_number = 0
current_range = 100
remaining_guesses = 0

def new_game():
    """
    Starts new game.
    """
    global secret_number
    secret_number = random.randrange(0, current_range)

    print "New game. Range is from 0 to " + str(current_range)
    set_guesses()
    
    print ""
    
def set_guesses():
    """
    Sets the number of available guesses for the current game
    """
    global remaining_guesses
        
    remaining_guesses = int(math.ceil(math.log(current_range, 2)))
            
    print "Number of remaining guesses is " + str(remaining_guesses)
    

# define event handlers for control panel
def range100():
    """ 
    Sets the range 0-100 and restart the game
    """    
    global current_range
    current_range = 100
    new_game()

def range1000():
    """ 
    Sets the range 0-1000 and restart the game
    """   
    global current_range 
    current_range = 1000
    new_game()


def input_guess(guess):
    """
    Receives a guess and compares it to the objective.
    """
    
    global remaining_guesses   
    remaining_guesses = remaining_guesses - 1
    print "Guess is " + guess
    guess_int = int(guess)
    
    print "Number of remaining guesses is " + str(remaining_guesses)
    
    if guess_int == secret_number:
        print "Correct\n"
        new_game()
    else:
        if guess_int > secret_number:
            print "Lower!"
        else:
            print "Higher!"
                
        if remaining_guesses == 0:
            print "You lost. The correct answer was " + str(secret_number)
            print ""
            new_game()
        else:
            print ""
        
    
           
    
# create frame
f = simplegui.create_frame("Guess the number",200,200)

# register event handlers for control elements
f.add_button("Range is [0, 100)", range100, 200)
f.add_button("Range is [0, 1000)", range1000, 200)
f.add_input("Enter a guess: ", input_guess, 200)

# call new_game 
new_game()

#Only show the frame after the first game init
f.start()
