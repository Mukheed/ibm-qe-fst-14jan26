player_1=input("Enter player-1 your choice: ")
player_2=input("Enter player-2 your choice: ")

if(player_1==player_2):
    print("Its a tie..!")
elif(player_1=="rock"):
    if(player_2=="scissor"):
        print("player-1 wins")
    else:
        print("player-2 wins")

elif(player_1=="scissor"):
    if(player_2=="paper"):
        print("player-1 wins")
    else:
        print("player-2 wins")

elif(player_1=="paper"):
    if(player_2=="rock"):
        print("player-1 wins")
    else:
        print("player-2 wins")
else:
    print("Enter the valid input.!")
