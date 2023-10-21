# Enter the Playername
Player1 = input("Enter Player1 name: ")
Player2 = input("Enter Player2 name: ")

# Get the Player choice
Player1choice = input(Player1 + ", do you want to choose Rock,Paper or Scissors ").lower()
Player2choice = input(Player2 + ", do you want to choose Rock,Paper or Scissors ").lower()

if Player1choice == Player2choice:
    {
      print("Game is tie")
    }
elif Player1choice == "rock":
    if Player2choice == "scissors":
        {
            print("Congratulations Rocks Wins the game")
        }
    else:
        {
            print("Congratulations Paper Wins the game")
        }
elif Player1choice == "scissors":
    if Player2choice == "paper":
        {
            print("Congratulations Scissors Wins the game")
        }
    else:
        {
            print("Congratulations Rocks Wins the game")
        }
elif Player1choice == "paper":
    if Player2choice == "rock":
        {
            print("Congratulations Paper Wins the game")
        }
    else:
        {
            print("Congratulations Scissors Wins the game")
        }
else:
    {
        print("Invalid Input: You have not entered Rock,Paper or Scissors")
    }

