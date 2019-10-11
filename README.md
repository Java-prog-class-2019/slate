# *SLATE* : Infiltration
A text-based adventure game by: [@mosefrey085](https://github.com/mosefrey085), [@exvacuum](https://github.com/exvacuum), and [@ewpratten](https://github.com/ewpratten)

## Software design

### Command parsing
Slate's command parsing system is based off [ANTLR v4](https://www.antlr.org/), and follows this general flow:
```
-- User input
|
+-> Lexical analysis & Parsing
|
+-> Tokenization
|
+-> Command processing
```

This system allows us to define our own "control language" with it's own grammar and syntax for user inputs during gameplay. 


## Notes
 - Random gen map
 - Enter, grab item, leave

## Components
 - Room
   - May contain items
   - May contain mysteries
   - Contains doorways to other rooms
 - Mystery
   - Anything that requires a key to open and contains an inventory
 - Map (Collection of rooms)
 - Inventory
   - Contains items
 - Guard
   - Someone you don't want to see
 - Item
   - Something you can pick up and use
