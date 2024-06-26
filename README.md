# Valorant Text To Ascii

## Overview



You can run it directly from the command line or by using the provided executable JAR file. Simply execute:

```
java -jar valorantTextToAsci.jar
```

### Usage

If you prefer to integrate ASCII art generation into your Java projects, you can use it as follows:

```java
ValorantTextToAscii valorantTextToAscii = new ValorantTextToAscii(asciiArtMap);
valorantTextToAscii.textToAscii26x13("hello!");
```

### JSON File Format

The ASCII art mappings are defined in a JSON format, where each character is represented as a 5x? grid of ASCII characters. Here’s an example snippet:

```json
{
  "A": [
    ["░", "█", "░"],
    ["█", "░", "█"],
    ["█", "█", "█"],
    ["█", "░", "█"],
    ["█", "░", "█"]
  ],
  "B": [
    ["█", "█", "░"],
    ["█", "░", "█"],
    ["█", "█", "░"],
    ["█", "░", "█"],
    ["█", "█", "░"]
  ],
  "M": [
    ["█", "░", "░", "░", "█"],
    ["█", "█", "░", "█", "█"],
    ["█", "░", "█", "░", "█"],
    ["█", "░", "░", "░", "█"],
    ["█", "░", "░", "░", "█"]
  ]
}
```

### Example

Here's a preview of the ASCII art representation of the word "Nice Try": 
![VALORANT](https://github.com/WeeeeeeeeeeS/valorantTextToAsci/assets/47720055/50d91e75-ff1f-473a-bd3b-e2c59d1da2cd)  
![image](https://github.com/WeeeeeeeeeeS/valorantTextToAsci/assets/47720055/050f530e-2c29-4aae-b23d-e032f29a4630)
