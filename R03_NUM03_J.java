public static long getInteger (DataInputStream
return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one−bits
}
