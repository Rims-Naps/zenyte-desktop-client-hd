package net.runelite.client.standalone;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSBuffer;

@ObfuscatedName("gm")
public class Buffer extends class76 implements RSBuffer {
   @ObfuscatedName("e")
   static long[] field1077;
   @ObfuscatedName("w")
   static int[] field1075;
   @ObfuscatedName("f")
   public byte[] field1074;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 2028894137
   )
   public int field1073;

   static {
      field1075 = new int[256];

      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field1075[var1] = var0;
      }

      field1077 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field1077[var2] = var4;
      }

   }

   public Buffer(int var1) {
      this.field1074 = class59.method1045(var1);
      this.field1073 = 0;
   }

   public Buffer(byte[] var1) {
      this.field1074 = var1;
      this.field1073 = 0;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1669910584"
   )
   public int readUnsignedShort() {
      this.field1073 += 2;
      return (this.field1074[this.field1073 - 1] & 255) + ((this.field1074[this.field1073 - 2] & 255) << 8);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1660024796"
   )
   public boolean method2088() {
      return (this.readUnsignedByte() & 1) == 1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "-2139456249"
   )
   public void method1924(int[] var1) {
      int var2 = this.field1073 / 8;
      this.field1073 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.readInt();
         int var5 = this.readInt();
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
            var6 += var7;
         }

         this.field1073 -= 8;
         this.writeInt(var4);
         this.writeInt(var5);
      }

   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2046558421"
   )
   public int readUnsigned128Byte() {
      return 128 - this.field1074[++this.field1073 - 1] & 255;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1067530287"
   )
   public void writeJAGString(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field1074[++this.field1073 - 1] = 0;
         this.field1073 += class293.method5131(var1, 0, var1.length(), this.field1074, this.field1073);
         this.field1074[++this.field1073 - 1] = 0;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1664490613"
   )
   public int method1929(int var1) {
      int var2 = class314.method5540(this.field1074, var1, this.field1073);
      this.writeInt(var2);
      return var2;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1666916552"
   )
   public int method1921() {
      return this.field1074[this.field1073] < 0?this.readInt() & Integer.MAX_VALUE:this.readUnsignedShort();
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "485472687"
   )
   public int readInt() {
      this.field1073 += 4;
      return ((this.field1074[this.field1073 - 3] & 255) << 16) + (this.field1074[this.field1073 - 1] & 255) + ((this.field1074[this.field1073 - 2] & 255) << 8) + ((this.field1074[this.field1073 - 4] & 255) << 24);
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1489307247"
   )
   public int readUnsignedByteC() {
      return 0 - this.field1074[++this.field1073 - 1] & 255;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1962567493"
   )
   public void writeIntLE(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)var1;
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 8);
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 16);
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "32"
   )
   public String method1916() {
      byte var1 = this.field1074[++this.field1073 - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method1912();
         if(var2 + this.field1073 > this.field1074.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = class63.method1129(this.field1074, this.field1073, var2);
            this.field1073 += var2;
            return var3;
         }
      }
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "842963668"
   )
   public void writeShortLE(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)var1;
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "39"
   )
   public void method1896(boolean var1) {
      this.writeByte(var1?1:0);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-115"
   )
   public void method2098(int var1) {
      if(var1 >= 0 && var1 < 128) {
         this.writeByte(var1);
      } else if(var1 >= 0 && var1 < 32768) {
         this.writeShort(var1 + 32768);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "2059236948"
   )
   public void writeString(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field1073 += class293.method5131(var1, 0, var1.length(), this.field1074, this.field1073);
         this.field1074[++this.field1073 - 1] = 0;
      }
   }

   @ObfuscatedName("r")
   public void method1895(long var1) {
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 56));
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 48));
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 40));
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 32));
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 24));
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 16));
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 8));
      this.field1074[++this.field1073 - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(B)B",
      garbageValue = "86"
   )
   public byte method1906() {
      return this.field1074[++this.field1073 - 1];
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1823533455"
   )
   public String readString() {
      int var1 = this.field1073;

      while(this.field1074[++this.field1073 - 1] != 0) {
         ;
      }

      int var2 = this.field1073 - var1 - 1;
      return var2 == 0?"":class192.method3297(this.field1074, var1, var2);
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1882579123"
   )
   public void writeByte128(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "1165888935"
   )
   public byte read128Byte() {
      return (byte)(128 - this.field1074[++this.field1073 - 1]);
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-11"
   )
   public int readUnsignedShortLE128() {
      this.field1073 += 2;
      return ((this.field1074[this.field1073 - 1] & 255) << 8) + (this.field1074[this.field1073 - 2] - 128 & 255);
   }

   @ObfuscatedName("p")
   public void method2020(long var1) {
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 40));
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 32));
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 24));
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 16));
      this.field1074[++this.field1073 - 1] = (byte)((int)(var1 >> 8));
      this.field1074[++this.field1073 - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1829734035"
   )
   public void method1900(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.field1074[++this.field1073 - 1] = var1[var4];
      }

   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-436378201"
   )
   public void writeIntV1(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 8);
      this.field1074[++this.field1073 - 1] = (byte)var1;
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 24);
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "15656"
   )
   public int method1912() {
      byte var1 = this.field1074[++this.field1073 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.field1074[++this.field1073 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1215602946"
   )
   public int readUnsignedShortLE() {
      this.field1073 += 2;
      return ((this.field1074[this.field1073 - 1] & 255) << 8) + (this.field1074[this.field1073 - 2] & 255);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-60"
   )
   public int method1988() {
      int var1 = this.field1074[this.field1073] & 255;
      return var1 < 128?this.readUnsignedByte() - 64:this.readUnsignedShort() - 49152;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "807916187"
   )
   public void writeInt(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 24);
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 16);
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 8);
      this.field1074[++this.field1073 - 1] = (byte)var1;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-319067683"
   )
   public int readIntV1() {
      this.field1073 += 4;
      return ((this.field1074[this.field1073 - 2] & 255) << 24) + ((this.field1074[this.field1073 - 4] & 255) << 8) + (this.field1074[this.field1073 - 3] & 255) + ((this.field1074[this.field1073 - 1] & 255) << 16);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1367310678"
   )
   public void writeMedium(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 16);
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 8);
      this.field1074[++this.field1073 - 1] = (byte)var1;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-56"
   )
   public void readBytes128(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = (byte)(this.field1074[++this.field1073 - 1] - 128);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1281256485"
   )
   public void method1889() {
      if(this.field1074 != null) {
         class282.method5015(this.field1074);
      }

      this.field1074 = null;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-9"
   )
   public int readShort() {
      this.field1073 += 2;
      int var1 = (this.field1074[this.field1073 - 1] & 255) + ((this.field1074[this.field1073 - 2] & 255) << 8);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "147090242"
   )
   public int readSmart() {
      int var1 = this.field1074[this.field1073] & 255;
      return var1 < 128?this.readUnsignedByte():this.readUnsignedShort() - 32768;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1495660911"
   )
   public int method1942() {
      if(this.field1074[this.field1073] < 0) {
         return this.readInt() & Integer.MAX_VALUE;
      } else {
         int var1 = this.readUnsignedShort();
         return var1 == 32767?-1:var1;
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "([IIIB)V",
      garbageValue = "35"
   )
   public void method1926(int[] var1, int var2, int var3) {
      int var4 = this.field1073;
      this.field1073 = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.readInt();
         int var8 = this.readInt();
         int var9 = 0;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.field1073 -= 8;
         this.writeInt(var7);
         this.writeInt(var8);
      }

      this.field1073 = var4;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "970118866"
   )
   public void method2048(int var1) {
      this.field1074[this.field1073 - var1 - 4] = (byte)(var1 >> 24);
      this.field1074[this.field1073 - var1 - 3] = (byte)(var1 >> 16);
      this.field1074[this.field1073 - var1 - 2] = (byte)(var1 >> 8);
      this.field1074[this.field1073 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "124"
   )
   public void writeShort(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 8);
      this.field1074[++this.field1073 - 1] = (byte)var1;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-189868685"
   )
   public void writeIntV2(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 16);
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 24);
      this.field1074[++this.field1073 - 1] = (byte)var1;
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1807384811"
   )
   public void writeShort128(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 8);
      this.field1074[++this.field1073 - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1579961553"
   )
   public int readShortLE() {
      this.field1073 += 2;
      int var1 = ((this.field1074[this.field1073 - 1] & 255) << 8) + (this.field1074[this.field1073 - 2] & 255);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-639331412"
   )
   public void writeByteC(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)(0 - var1);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)V",
      garbageValue = "16711935"
   )
   public void method1899(CharSequence var1) {
      int var3 = var1.length();
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 <= 127) {
            ++var4;
         } else if(var6 <= 2047) {
            var4 += 2;
         } else {
            var4 += 3;
         }
      }

      this.field1074[++this.field1073 - 1] = 0;
      this.method1967(var4);
      this.field1073 += class21.method219(this.field1074, this.field1073, var1);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1370023537"
   )
   public void readBytes(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.field1074[++this.field1073 - 1];
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "([IIII)V",
      garbageValue = "1529210597"
   )
   public void method2112(int[] var1, int var2, int var3) {
      int var4 = this.field1073;
      this.field1073 = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.readInt();
         int var8 = this.readInt();
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.field1073 -= 8;
         this.writeInt(var7);
         this.writeInt(var8);
      }

      this.field1073 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "925770886"
   )
   public void writeByte(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)var1;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1633617537"
   )
   public int readIntLE() {
      this.field1073 += 4;
      return (this.field1074[this.field1073 - 4] & 255) + ((this.field1074[this.field1073 - 3] & 255) << 8) + ((this.field1074[this.field1073 - 2] & 255) << 16) + ((this.field1074[this.field1073 - 1] & 255) << 24);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "495584415"
   )
   public void method1903(int var1) {
      this.field1074[this.field1073 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1877577137"
   )
   public boolean method1930() {
      this.field1073 -= 4;
      int var1 = class314.method5540(this.field1074, 0, this.field1073);
      int var2 = this.readInt();
      return var2 == var1;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "19783"
   )
   public int readUnsignedShort128() {
      this.field1073 += 2;
      return (this.field1074[this.field1073 - 1] - 128 & 255) + ((this.field1074[this.field1073 - 2] & 255) << 8);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1002879041"
   )
   public String method1913() {
      if(this.field1074[this.field1073] == 0) {
         ++this.field1073;
         return null;
      } else {
         return this.readString();
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V",
      garbageValue = "-53"
   )
   public void encryptRSA(BigInteger var1, BigInteger var2) {
      int var3 = this.field1073;
      this.field1073 = 0;
      byte[] var4 = new byte[var3];
      this.readBytes(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.field1073 = 0;
      this.writeShort(var7.length);
      this.method1900(var7, 0, var7.length);
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1688693684"
   )
   public void writeShortLE128(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)(var1 + 128);
      this.field1074[++this.field1073 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-62"
   )
   public void method1902(int var1) {
      this.field1074[this.field1073 - var1 - 2] = (byte)(var1 >> 8);
      this.field1074[this.field1073 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "1008044673"
   )
   public void method1925(int[] var1) {
      int var2 = this.field1073 / 8;
      this.field1073 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.readInt();
         int var5 = this.readInt();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.field1073 -= 8;
         this.writeInt(var4);
         this.writeInt(var5);
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "-1715335234"
   )
   public byte readByte128() {
      return (byte)(this.field1074[++this.field1073 - 1] - 128);
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2093413461"
   )
   public int readMedium() {
      this.field1073 += 3;
      return (this.field1074[this.field1073 - 3] & 255) + ((this.field1074[this.field1073 - 2] & 255) << 8) + ((this.field1074[this.field1073 - 1] & 255) << 16);
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "163758376"
   )
   public byte readByteC() {
      return (byte)(0 - this.field1074[++this.field1073 - 1]);
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "50"
   )
   public int readUnsignedByte128() {
      return this.field1074[++this.field1073 - 1] - 128 & 255;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1539377587"
   )
   public int method1964() {
      int var1 = 0;

      int var2;
      for(var2 = this.readSmart(); var2 == 32767; var2 = this.readSmart()) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1840428759"
   )
   public void write128Byte(int var1) {
      this.field1074[++this.field1073 - 1] = (byte)(128 - var1);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1970753705"
   )
   public int readIntV2() {
      this.field1073 += 4;
      return ((this.field1074[this.field1073 - 1] & 255) << 8) + ((this.field1074[this.field1073 - 4] & 255) << 16) + (this.field1074[this.field1073 - 2] & 255) + ((this.field1074[this.field1073 - 3] & 255) << 24);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "1066388238"
   )
   public long method1998() {
      long var1 = (long)this.readInt() & 4294967295L;
      long var3 = (long)this.readInt() & 4294967295L;
      return var3 + (var1 << 32);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "652105887"
   )
   public void method1967(int var1) {
      if((var1 & -128) != 0) {
         if((var1 & -16384) != 0) {
            if((var1 & -2097152) != 0) {
               if((var1 & -268435456) != 0) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "520366755"
   )
   public int method1909() {
      this.field1073 += 3;
      return ((this.field1074[this.field1073 - 3] & 255) << 16) + (this.field1074[this.field1073 - 1] & 255) + ((this.field1074[this.field1073 - 2] & 255) << 8);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1628577912"
   )
   public String method1915() {
      byte var1 = this.field1074[++this.field1073 - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.field1073;

         while(this.field1074[++this.field1073 - 1] != 0) {
            ;
         }

         int var3 = this.field1073 - var2 - 1;
         return var3 == 0?"":class192.method3297(this.field1074, var2, var3);
      }
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "510295331"
   )
   public int readShortLE128() {
      this.field1073 += 2;
      int var1 = ((this.field1074[this.field1073 - 1] & 255) << 8) + (this.field1074[this.field1073 - 2] - 128 & 255);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   public int readUnsignedByte() {
      return this.field1074[++this.field1073 - 1] & 255;
   }

   public byte[] getPayload() {
      return this.field1074;
   }

   public int getOffset() {
      return this.field1073;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Ljn;",
      garbageValue = "1655836393"
   )
   public static class223 method2121(int var0) {
      class223 var1 = (class223)class223.field2179.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class223.field2175.method2579(3, var0, -1263782348);
         var1 = new class223();
         if(var2 != null) {
            var1.method3990(new Buffer(var2));
         }

         class223.field2179.method2275(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lik;III)Lle;",
      garbageValue = "-857734859"
   )
   static class32 method2122(class148 var0, int var1, int var2) {
      byte[] var4 = var0.method2579(var1, var2, -1476342148);
      boolean var3;
      if(var4 == null) {
         var3 = false;
      } else {
         class194.method3303(var4);
         var3 = true;
      }

      if(!var3) {
         return null;
      } else {
         class32 var5 = new class32();
         var5.field261 = class112.field1057;
         var5.field262 = class112.field1054;
         var5.field259 = class120.field1149[0];
         var5.field255 = class112.field1055[0];
         var5.field257 = class112.field1052[0];
         var5.field260 = class167.field1544[0];
         var5.field256 = class192.field1841;
         var5.field258 = class161.field1507[0];
         class120.field1149 = null;
         class112.field1055 = null;
         class112.field1052 = null;
         class167.field1544 = null;
         class192.field1841 = null;
         class161.field1507 = null;
         return var5;
      }
   }
}
