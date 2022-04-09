# RockPaperScissors
A simple console based game application - Rock, Paper and Scissors
Rules:
Two users play against each other - both of them chooses one among the following (Rock, Paper and Scissors) at the same moment.
Win Criteria:
Combinations --
paper > rock && paper < scissors
rock < paper && rock > scissors
scissors > paper && scissors < rock
1. If person A chooses rock, person B chooses scissors --> A wins as rock > scissors
2. If person A chooses rock, person B chooses paper --> B wins as rock < paper
3. If person A chooses paper, person B chooses scissors --> B wins as paper < scissors
4. If person A chooses paper, person B chooses rock --> A wins as paper > rock
5. If person A chooses scissors, person B chooses paper --> A wins as scissors > paper
6. If person A chooses scissors, person B chooses rock --> B wins as rock > scissors
For brevity, play with computer, a random picker here
Next pick a scanner function to allow input from a user example: John
