import unittest
import sys

from rpsls 		import rpsls  
from cStringIO 	import StringIO

class RPSLSTest(unittest.TestCase):
	def setUp(self):
		sys.stdout = StringIO()
	
	def tearDown(self):
		sys.stdout.close()
		sys.stdout = sys.__stdout__

	def test_can_call_rpsls_module(self):
		rpsls.name_to_number("Test")
	
	def test_rock_is_zero(self):
		self.assertEqual(rpsls.name_to_number("rock"), 0)
	
	def test_Spock_is_one(self):
		self.assertEqual(rpsls.name_to_number("Spock"), 1)

	def test_spock_is_invalid(self):
		self.assertEqual(rpsls.name_to_number("spock"), None)

	def test_paper_is_two(self):
		self.assertEqual(rpsls.name_to_number("paper"), 2)

	def test_lizard_is_three(self):
		self.assertEqual(rpsls.name_to_number("lizard"), 3)
		
	def test_scissors_is_four(self):
		self.assertEqual(rpsls.name_to_number("scissors"), 4)
		
	def test_number_to_name_restores_name_to_number(self):
		self.assertEqual("rock", rpsls.number_to_name(rpsls.name_to_number("rock")))
		self.assertEqual("Spock", rpsls.number_to_name(rpsls.name_to_number("Spock")))
		self.assertEqual("paper", rpsls.number_to_name(rpsls.name_to_number("paper")))
		self.assertEqual("lizard", rpsls.number_to_name(rpsls.name_to_number("lizard")))
		self.assertEqual("scissors", rpsls.number_to_name(rpsls.name_to_number("scissors")))
		
	def test_invalid_number_returns_None(self):
		self.assertEqual(rpsls.number_to_name(-1), None)
		
	def test_first_execution_print_player_chooses(self):
		rpsls.rpsls_counter = 0
		rpsls.rpsls("Spock")
		output = sys.stdout.getvalue()
		self.assertEquals(output[:14], "Player chooses")			
		
	def test_rpsls_blank_line_if_consecutive_games(self):
		rpsls.rpsls_counter = 0
 
		#First Execution
		rpsls.rpsls("Test")
		sys.stdout.getvalue()
		sys.stdout.close()
		sys.stdout = StringIO()
 
		#Second execution
		rpsls.rpsls("Spock")
		first_line = sys.stdout.getvalue()
		
		self.assertEquals(first_line[-2:], "\n\n")
		
	def test_victory_rules(self):
		"""
		Paper covers Rock
		Rock crushes Lizard
		Lizard poisons Spock
		Spock smashes Scissors
		Scissors decapitates Lizard
		Lizard eats Paper
		Paper disproves Spock
		Spock vaporizes Rock
		(and as it always has) Rock crushes scissors
		"""
		
		rulesList = [ 
			["paper", "scissors", "Computer wins!\n"],
			["scissors", "paper", "Player wins!\n"],
			["rock", "lizard", "Player wins!\n"],
			["Spock", "lizard", "Computer wins!\n"],
			["Spock", "scissors", "Player wins!\n"],
			["lizard", "scissors", "Computer wins!\n"],
			["paper", "Spock", "Player wins!\n"],
			["rock", "Spock", "Computer wins!\n"],
			["rock", "rock", "Player and computer tie!\n"],
			["scissors", "rock", "Computer wins!\n"]]
		
		
		for r in rulesList:
			self.assertWinningRule(r[0], r[1], r[2])
					
	def assertWinningRule(self, player_choice, cpu_choice, winner):
		self.tearDown()
		self.setUp()
		player_number = rpsls.name_to_number(player_choice)
		cpu_number = rpsls.name_to_number(cpu_choice)
		rpsls.rpsls_compute_winner(player_number, cpu_number)
		response = sys.stdout.getvalue()
		 
		self.assertEqual(response, winner)