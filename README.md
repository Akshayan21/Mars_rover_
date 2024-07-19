# Mars_Rover_Simulation

## Overview
This project simulates the movement of a Mars Rover on a grid. The Mars Rover can navigate based on user commands, rotate left or right, and avoid obstacles on the grid.

## Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Structure](#structure)
- [Customization](#customization)

## Features
- Mars Rover movement simulation
- Rotation to the left and right
- Obstacle detection and avoidance
- Command pattern implementation for flexibility
- Structural patterns for grid and obstacle representation

## Getting Started
### Prerequisites
- Java Development Kit (JDK) installed

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/azeemyoonus/Mars_Rover_Simulation.git
2. Navigate to the project directory:
    ```bash
    cd Mars_Rover_Simulation
3. Compile the Java files:
    ```bash
    javac *.java
## Usage
1. Run the MarsRoverSimulation class:
    ```bash
    java MarsRoverSimulation

- Explore the Mars Rover simulation!

## Structure
The project is structured as follows:

- **MarsRover:**
  Represents the Mars Rover and encapsulates its movement logic.

- **GridComponent:**
  An interface for grid components, providing a common structure for different elements within the grid.

- **ObstacleGrid:**
  Represents a grid component specifically designed to contain obstacles. Implements the `GridComponent` interface.

- **Command:**
  An interface defining the structure for command objects. Used to encapsulate different operations.

- **MoveCommand:**
  A concrete implementation of the `Command` interface, representing the command to move the Mars Rover.

- **RotateLeftCommand:**
  A concrete implementation of the `Command` interface, representing the command to rotate the Mars Rover to the left.

- **RotateRightCommand:**
  A concrete implementation of the `Command` interface, representing the command to rotate the Mars Rover to the right.

- **RoverCommandInvoker:**
  An invoker class responsible for executing commands on the Mars Rover. It holds a reference to a command object and triggers its execution.

- **ObstacleEncounteredException:**
  A custom exception class indicating that an obstacle has been encountered during the Mars Rover movement.

- **BeyondGridBoundaryException:**
  A custom exception class indicating that the Mars Rover is attempting to move beyond the grid boundary.

## Customization

You can customize the project by:

- **Adjusting Grid Size and Boundary Conditions in `MarsRover`:**
  Modify the parameters related to the grid size and boundary conditions in the `MarsRover` class to tailor it to specific requirements.

- **Modifying Obstacle Representation in `ObstacleGrid`:**
  Customize how obstacles are represented or managed within the grid by modifying the `ObstacleGrid` class.

- **Extending Command Functionality or Creating New Commands:**
  Add new commands or extend the functionality of existing commands by implementing new classes that adhere to the `Command` interface. This provides flexibility in controlling the Mars Rover's behavior.