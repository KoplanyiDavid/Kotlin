import java.io.FileInputStream

var x: Int = 0              // int x = 0;

val y: Int = 1              // final int y = 1;

val z = 2                   // final int z = 2;


// final FileInputStream fis = new FileInputStream("filename");
val fis = FileInputStream("filename")


val myLong = 1L             // final long myLong = 1;
val myFloat = 1f            // final float myFloat = 1;
val myDouble = 1.0          // final double myDouble = 1;


val name = "Sarah"           // final String name = "Sarah";


val sum = "$x + $y + $z = ${x + y + z}"     // outputs "0 + 1 + 2 = 3"
