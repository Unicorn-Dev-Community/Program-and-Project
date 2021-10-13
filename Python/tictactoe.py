import random
from IPython.display import clear_output


def Dispaly_board(board):
    clear_output()
    print(board_list[7]+'|'+board_list[8]+'|'+board_list[9])
    print(board_list[4]+'|'+board_list[5]+'|'+board_list[6])
    print(board_list[1]+'|'+board_list[2]+'|'+board_list[3])


def player_input():
    marker = ' '
    # KEEP ASKING PLAYER 1 TO CHOOSE X OR O
    while marker != 'X' and marker != 'O':
        marker = input('Do you need X or O :')

    # ASSIGN PLAYER 2, THE OTHER MARKER
    player1 = marker

    if player1 == 'X':
        player2 = 'O'
    else:
        player2 = 'X'

    return(player1, player2)


# print(player2_marker)
# print((player2_marker)

def place_marker(board, marker, position):
    board[position] = marker
    

# place_marker(board_list,'X',5)
# Dispaly_board(board_list)

def win_check(board, marker):
    return ((board[7] == marker and board[8] == marker and board[9] == marker) or  # across the top
            # across the middle
            (board[4] == marker and board[5] == marker and board[6] == marker) or
            (board[1] == marker and board[2] == marker and board[3] == marker) or
            (board[7] == marker and board[4] == marker and board[1] == marker) or
            (board[8] == marker and board[5] == marker and board[2] == marker) or
            (board[9] == marker and board[6] == marker and board[3] == marker) or
            (board[7] == marker and board[5] == marker and board[3] == marker) or
            (board[9] == marker and board[5] == marker and board[1] == marker))

# Dispaly_board(board_list)
# win_check(board_list,'X')


def choose_first():
    flip = random.randint(0, 1)

    if flip == 0:
        return 'Player1'
    if flip == 1:
        return 'Player2'


def space_check(board, position):

    return board[position] == ' '


def full_board_space(board):
    for i in range(1, 9):
        if space_check(board, i):
            return False
    # BOARD IS FULL IF WE RETURN TRUE
    return True


def player_choice(board):

    position = ' '

    while position not in range(1, 10) or not space_check(board, position):
        position = int(input("Choose a position between (1-9) : "))

    return(position)


def replay():
    choice = input("Do you need to play again (Y / N): ")

    return choice == 'Y'


# WHILE LOOP TO KEEP RUNNING THE GAME

print("Welcome to TIC-TAC-TOE")

while True:
    # PLAY THE GAME

    # SETTING EVERYTHING UP
    board_list = [' '] * 10
    player1_marker, player2_marker = player_input()
    turn = choose_first()
    print(turn+" will go first")

    play_game = input("Ready to play? (Y/N) :")

    if play_game == 'Y':
        game_on = True
    else:
        game_on = False

    while game_on:
    # GAME PLAY
        if turn == 'Player 1':

            # show the board
            Dispaly_board(board_list)

            # choose a position
            position = player_choice(board_list)

            # place the marker on a position
            place_marker(board_list, player1_marker, position)

            if win_check(board_list, player1_marker):
                Dispaly_board(board_list)
                print("Player 1 has won !!!")
                game_on = False
            else:
                # Or check if there is a tie
                if full_board_space(board_list):
                    Dispaly_board(board_list)
                    print("TIE")
                    game_on = False
                else:
                    turn = 'Player 2'

        else:

            # show the board
            Dispaly_board(board_list)

            # choose a position
            position = player_choice(board_list)

            # place the marker on a position
            place_marker(board_list, player2_marker, position)

            if win_check(board_list, player2_marker):
                Dispaly_board(board_list)
                print("Player 2 has won !!!")
                game_on = False
            else:
                # Or check if there is a tie
                if full_board_space(board_list):
                    Dispaly_board(board_list)
                    print("TIE")
                    game_on = False
                else:
                    turn = 'Player 1'

    if not replay():
        break

    # BREAK OUT OF THE WHILE LOOP ON replay()
