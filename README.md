# Magical Arena

## Overview
This project is a simulation of a **Magical Arena** where two players battle until one player's health reaches zero. Players have health, strength, and attack attributes, and they take turns attacking and defending based on dice rolls.

## Features
- Each player rolls dice to determine their attack or defense multiplier.
- The attacker’s damage is based on their attack attribute and dice roll.
- The defender’s defense is based on their strength attribute and dice roll.
- The game continues until one player’s health reaches zero.

## Getting Started

### Prerequisites
- **Java**: Ensure that Java (version 8 or higher) is installed on your machine.

## Installation

1. Clone the repository:
    ```bash
    git clone <repository-url>
    ```

2. Navigate to the project directory:
    ```bash
    cd magical-arena
    ```

## Running the Program

To compile and run the program, execute the following commands in the terminal:

1. Compile the code:
    ```bash
    javac -d bin src/*.java
    ```

2. Run the Main method:
    ```bash
    java -cp bin Main
    ```

The `Main` method initializes the players and starts the match. You should see the battle progress output as each player takes turns attacking and defending until one player’s health reaches zero.
