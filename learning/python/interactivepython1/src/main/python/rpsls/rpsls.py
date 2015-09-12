import random

# The key idea of this program is to equate the strings
# "rock", "paper", "scissors", "lizard", "Spock" to numbers
# as follows:
#
# 0 - rock
# 1 - Spock
# 2 - paper
# 3 - lizard
# 4 - scissors


rpsls_counter = 0

def name_to_number(name):
    """
     Converts a rpsls name into a number between 0 and 4
     Returns None if no match
    """
    
    if name == "rock":
        return 0
    elif name == "Spock":
        return 1
    elif name == "paper":
        return 2
    elif name == "lizard":
        return 3
    elif name == "scissors":
        return 4
    else:
        print "name_to_number: invalid argument ", name

        
def number_to_name(number):
    """
     Converts a number into a rpsls name
     Returns None if no match
    """

    if number == 0:
        return "rock"
    elif number == 1:
        return  "Spock"
    elif number ==  2:
        return "paper"
    elif number ==  3:
        return "lizard"
    elif number ==  4:
        return "scissors"
    else:
        print "number_to_name: invalid argument " , number
        

def rpsls(player_choice): 
    global rpsls_counter
    if rpsls_counter > 0:
        print ""
        
    rpsls_counter += 1

    player_number  = name_to_number(player_choice)
    cpu_number = random.randrange(0, 5)

    if (player_number == None):
        print "Invalid player choice"
        return
    
    print "Player chooses " + player_choice
    print "Computer chooses " + number_to_name(cpu_number)
    
    rpsls_compute_winner(player_number, cpu_number)
    
    
def rpsls_compute_winner(player_number, cpu_number):
    """
     Determines the winner of the game
    """
    result = (player_number - cpu_number) % 5
    if result == 0:
       print "Player and computer tie!"
    elif result > 2:
       print "Computer wins!"
    else:
       print "Player wins!"

    
# test your code - THESE CALLS MUST BE PRESENT IN YOUR SUBMITTED CODE
rpsls("rock")
rpsls("Spock")
rpsls("paper")
rpsls("lizard")
rpsls("scissors")

# always remember to check your completed program against the grading rubric


