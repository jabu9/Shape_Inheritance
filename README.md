# Shape Inheritance

A Java console app that demonstrates **inheritance, abstract classes, and polymorphism** using 2D and 3D shapes. Pick a shape from the menu, enter its dimensions, and get its area or volume.

Originally built for CMSC 335 (Object-Oriented and Concurrent Programming).

## Shapes

| 2D (area)  | 3D (volume) |
|------------|-------------|
| Circle     | Sphere      |
| Rectangle  | Cube        |
| Square     | Cone        |
| Triangle   | Cylinder    |
|            | Torus       |

## Class hierarchy

```
Shape (abstract)
├── TwoDimensionalShape (abstract) → Circle, Rectangle, Square, Triangle
└── ThreeDimensionalShape (abstract) → Sphere, Cube, Cone, Cylinder, Torus
```

`MenuEntry` is a small generic helper that drives the console menu and validates input.

## Run it

Requires a JDK (8+).

```bash
git clone https://github.com/jabu9/Shape_Inheritance.git
cd Shape_Inheritance
javac -d out shapes/*.java utils/*.java
java -cp out utils.Main
```

## Project structure

```
Shape_Inheritance/
├── shapes/   # Concrete shape classes
└── utils/    # Main entry point, menu helper, abstract base classes
```

## License

[MIT](LICENSE) © 2023 Jordan Abuhantash
