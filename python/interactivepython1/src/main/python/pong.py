import simplegui
import random

# initialize globals - pos and vel encode vertical info for paddles
WIDTH = 600
HEIGHT = 400       
BALL_RADIUS = 20
PAD_WIDTH = 8
PAD_HEIGHT = 80
HALF_PAD_WIDTH = PAD_WIDTH / 2
HALF_PAD_HEIGHT = PAD_HEIGHT / 2
LEFT = False
RIGHT = True

#Ball Control
ball_pos = []
ball_vel = []

#paddle control
paddle1_pos = 0
paddle2_pos = 0
paddle1_vel = 0
paddle2_vel = 0

#player score
playerleft_score = 0
playerright_score = 0

# initialize ball_pos and ball_vel for new bal in middle of table
# if direction is RIGHT, the ball's velocity is upper right, else upper left
def spawn_ball(direction):
    global ball_pos, ball_vel # these are vectors stored as lists
    ball_pos = [WIDTH / 2, HEIGHT / 2]
    
    horizontal_velocity = random.randrange(120, 240) / 60
    vertical_velocity =  - (random.randrange(60, 180) / 60)
    
    if direction == LEFT:
        horizontal_velocity = - horizontal_velocity
     
    ball_vel = [horizontal_velocity, vertical_velocity]
        
# define event handlers
def new_game():
    global paddle1_pos, paddle2_pos, paddle1_vel, paddle2_vel  # these are numbers
    global playerleft_score, playerright_score  # these are ints

    playerright_score = 0
    playerleft_score = 0

    if random.randrange(0,2) == 0:
        spawn_ball(LEFT)
    else:
        spawn_ball(RIGHT)
    

def check_wall_colisions():
    """
    Controls the colisions between the ball and the walls
    """        
    if (ball_pos[1] <= BALL_RADIUS) or (ball_pos[1] >= (HEIGHT - BALL_RADIUS)):
        ball_vel[1] = -ball_vel[1]
    

def check_pad_colisions():
    """
    Checks the colisions of the paddles
    """
    global playerleft_score, playerright_score
    #left 
    if (ball_pos[0] <= BALL_RADIUS + PAD_WIDTH):
        if (ball_pos[1] >= paddle1_pos) and (ball_pos[1] <= paddle1_pos + PAD_HEIGHT):
            ball_vel[0] = -ball_vel[0] * 1.10
            ball_vel[1] = ball_vel[1] * 1.10
        else:
            playerright_score += 1
            spawn_ball(RIGHT)
        
    #right
    if (ball_pos[0] >= WIDTH - BALL_RADIUS - PAD_WIDTH):
        if (ball_pos[1] >= paddle2_pos) and (ball_pos[1] <= paddle2_pos + PAD_HEIGHT):
            ball_vel[0] = -ball_vel[0] * 1.10
            ball_vel[1] = ball_vel[1] * 1.10
        else:
            playerleft_score += 1
            spawn_ball(LEFT)
        
def set_paddle_pos(current_pos, current_vel):
    """
    Given a current paddle pos, returns the new position
    considering the current velocity and field bonds.
    """
    
    new_pos = current_pos + 4 * current_vel
    if new_pos < 0:
        return 0
    
    if new_pos > HEIGHT - PAD_HEIGHT:
        return HEIGHT - PAD_HEIGHT
    
    return new_pos

def draw(canvas):
    global score1, score2, paddle1_pos, paddle2_pos, ball_pos, ball_vel
 
        
    # draw mid line and gutters
    canvas.draw_line([WIDTH / 2, 0],[WIDTH / 2, HEIGHT], 1, "White")
    canvas.draw_line([PAD_WIDTH, 0],[PAD_WIDTH, HEIGHT], 1, "White")
    canvas.draw_line([WIDTH - PAD_WIDTH, 0],[WIDTH - PAD_WIDTH, HEIGHT], 1, "White")
        
    # update ball
    ball_pos[0] += ball_vel[0]
    ball_pos[1] += ball_vel[1]    
    
   
    # draw ball
    canvas.draw_circle(ball_pos, BALL_RADIUS, 2, "red", "red")
   
    # update paddle's vertical position, keep paddle on the screen
    paddle1_pos = set_paddle_pos(paddle1_pos, paddle1_vel)
    paddle2_pos = set_paddle_pos(paddle2_pos, paddle2_vel)
 
    # draw paddles
    canvas.draw_line((1, paddle1_pos), 
                         (1, paddle1_pos + PAD_HEIGHT),PAD_WIDTH, 'White')
 
    canvas.draw_line((WIDTH - PAD_WIDTH, paddle2_pos), 
                         (WIDTH - PAD_WIDTH, paddle2_pos + PAD_HEIGHT),PAD_WIDTH, 'White')
    
    check_wall_colisions()
    check_pad_colisions()
    
    canvas.draw_text(str(playerleft_score), [WIDTH/2 - 50, 70], 40, "White")
    canvas.draw_text(str(playerright_score), [WIDTH/2 + 30, 70], 40, "White")

    
        
def keydown(key):
    global paddle1_vel, paddle2_vel
    if key == simplegui.KEY_MAP['w']:
        paddle1_vel = -1
    if key == simplegui.KEY_MAP['s']:
        paddle1_vel = 1
    elif key == simplegui.KEY_MAP['up']:
        paddle2_vel = -1
    elif key == simplegui.KEY_MAP['down']:
        paddle2_vel = 1
        
     
def keyup(key):
    global paddle1_vel, paddle2_vel
    if key == simplegui.KEY_MAP['w']:
        paddle1_vel = 0
    if key == simplegui.KEY_MAP['s']:
        paddle1_vel = 0
    elif key == simplegui.KEY_MAP['up']:
        paddle2_vel = 0
    elif key == simplegui.KEY_MAP['down']:
        paddle2_vel = 0  
    

# create frame
frame = simplegui.create_frame("Pong", WIDTH, HEIGHT)
frame.set_draw_handler(draw)
frame.set_keydown_handler(keydown)
frame.set_keyup_handler(keyup)
frame.add_button('Reset', new_game,150)


# start frame
new_game()
frame.start()
