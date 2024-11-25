# Java Base Course Workshop Project

## Space Transporter

### Rebuild and improve this game in space context:
https://www.youtube.com/watch?v=i_WmVBwEE4U&t=27s

## Mission:
You have just landed at a space base and your mission is to move
all the supply boxes to the loading area of your spacecraft.
You need to find each boxes and push them into the right direction.
Make sure that you make minimal number of steps otherwise you might
run out of oxygen. In the meanwhile you can collect some gold 
that materialize and dematerialize randomly. The more you
collect the more successful the mission is.
Details on transporter usage, statistics, box movements are to be specified ...


## Steps of implementation (not identical to workshop numbers):
1.  __Draw area full of tiles__

    Draw 10*10 area full of floor tiles.

2.  __Create map structure (floor, wall)__
    - `2 dimensional array`

    Given an image of the desired space area create a data structure that represents it. Choose the simplest solution. 
    Represent floor and wall only.

3.  __Display area (floor, wall)__
      - `2 dimensional array`
      - `Loops`
      - `Conditions`

      Given the data structure representing the area, write the logic that displays it on the screen.

4.  __Add and display all items (boxes, teleport, assigned area for loading boxes)__

      Add further area elements and display them on the screen as well.

5.  __Astronaut (astronaut)__

      Add astronaut with front image to top left tile.

6.  __Movement__ (hero)
      
      When user presses any of the 4 arrows on the keyboard, the astronaut shall move to the given direction.

7.  __Turning__
      - `Conditions`

      When user presses any of the 4 arrows on the keyboard, the astronaut shall turn to the given direction besides moving

8.  __Limit movement to area__
      - `Conditions`

      The astronaut shall not be able to get outside the area.

9.  __Do not enter walls & boxes__
      - `Inheritance`
      - `Abstract classes`
      - `Fields, access modifiers`

      The astronaut shall not be able to step into walls and boxes.

10.  __> Refactor <__
      - `Single Responsibility Principle`

      Refactor your code based on Single Responsibility principle focusing on classes: all of them shall have one responsibility.

11.  __Move boxes__

      When the astronaut is right next to a box and the user hits the direction towards the box, the astronaut shall be able to push the box when there is nothing blocking it. 
      A box can be blocked by a wall, gate, edge of the area or another box.

12. __Gold stones__
      - `Random number generation`
      - `2 dimensional array`

      At the floor cells gold stones shall randomly appear and disappear. Their existence
      time can vary randomly between 5 and 15 astronaut steps.

13. __Pick gold stones__
      - `Variable length array`

      When the astronaut steps over a tile where there is a gold stone present and space button gets pressed, the astronaut shall upload the asteroid to its backpack. The astronaut can take multiple asteroids. When an asteroid is
      taken, it disappears from the map.


14.  __> Gate <__

      Add transporter gates to the area. When the astronaut steps on the transporter, it shall immediately appear on the top of the other transporter.

15. __Calculate statistics__
      - `Data types`
      - `Math operations`
      - `Casting`

    Data to be managed:
      - Oxygen used by the astronaut
      - Oxygen available
      - Number of boxes remaining to be moved
      - Number of gold stones collected by the player

16. __Display statistics__

      Define an area besides the map and display all the statistics

17.  __> Refactor <__
      - `SOLID principles`

18. __Completion__
      - `Conditions`
      - `Math operations`
      - `JOptionPane`

      The player wins when all boxes are at the assigned areas and has collected at least one gold. Display congratulations in the message dialog. After clicking on the OK button, the game should end.

19. __Display errors__
      - `Throw exceptions`
      - `Handle exceptions`
      - `JOptionPane`

      Display error message at the message dialog when:
      - the get into positions that make the game impossible to complete
      - the player loses when it runs out of oxygen.
      
      After clicking on the OK button, the game should end.

## Extras
    - Multiplayer (2 astronauts for 2 people using the same keyboard)
    - 50 * 50 area (requires extra management of displayed area)
    - Multiple levels (each has different map)
    - Map validator testing if the given map is doable
    - Make layered walls adaptive (The images folder contains 2 wall images. Create a pattern out of the walls, like wallpaper. By connecting blocks, you get a unique map with different sets of walls.)
