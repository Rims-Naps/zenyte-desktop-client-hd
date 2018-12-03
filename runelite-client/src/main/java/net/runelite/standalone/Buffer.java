package net.runelite.standalone;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSBuffer;

@ObfuscatedName("gm")
public class Buffer extends class197 implements RSBuffer {
   @ObfuscatedName("e")
   static long[] field1697;
   @ObfuscatedName("w")
   static int[] field1695;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 2028894137
   )
   public int field1693;
   @ObfuscatedName("f")
   public byte[] field1694;

   static {
      field1695 = new int[256];

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

         field1695[var1] = var0;
      }

      field1697 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field1697[var2] = var4;
      }

   }

   public Buffer(int var1) {
      this.field1694 = class133.method2559(var1);
      this.field1693 = 0;
   }

   public Buffer(byte[] var1) {
      this.field1694 = var1;
      this.field1693 = 0;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-319067683"
   )
   public int method2304() {
      this.field1693 += 4;
      return ((this.field1694[this.field1693 - 2] & 255) << 24) + ((this.field1694[this.field1693 - 4] & 255) << 8) + (this.field1694[this.field1693 - 3] & 255) + ((this.field1694[this.field1693 - 1] & 255) << 16);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1669910584"
   )
   public int readShort() {
      this.field1693 += 2;
      return (this.field1694[this.field1693 - 1] & 255) + ((this.field1694[this.field1693 - 2] & 255) << 8);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1666916552"
   )
   public int method2272() {
      return this.field1694[this.field1693] < 0?this.readInt() & Integer.MAX_VALUE:this.readShort();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "495584415"
   )
   public void method2254(int var1) {
      this.field1694[this.field1693 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-189868685"
   )
   public void method2302(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 16);
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 24);
      this.field1694[++this.field1693 - 1] = (byte)var1;
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(B)B",
      garbageValue = "86"
   )
   public byte method2257() {
      return this.field1694[++this.field1693 - 1];
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "15656"
   )
   public int method2263() {
      byte var1 = this.field1694[++this.field1693 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.field1694[++this.field1693 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "337964448"
   )
   public int readInt() {
      this.field1693 += 4;
      return ((this.field1694[this.field1693 - 3] & 255) << 16) + (this.field1694[this.field1693 - 1] & 255) + ((this.field1694[this.field1693 - 2] & 255) << 8) + ((this.field1694[this.field1693 - 4] & 255) << 24);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1370023537"
   )
   public void method2295(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.field1694[++this.field1693 - 1];
      }

   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1579961553"
   )
   public int method2297() {
      this.field1693 += 2;
      int var1 = ((this.field1694[this.field1693 - 1] & 255) << 8) + (this.field1694[this.field1693 - 2] & 255);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-436378201"
   )
   public void method2301(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 8);
      this.field1694[++this.field1693 - 1] = (byte)var1;
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 24);
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "19783"
   )
   public int method2460() {
      this.field1693 += 2;
      return (this.field1694[this.field1693 - 1] - 128 & 255) + ((this.field1694[this.field1693 - 2] & 255) << 8);
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
         this.field1693 += class219.method4505(var1, 0, var1.length(), this.field1694, this.field1693);
         this.field1694[++this.field1693 - 1] = 0;
      }
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1688693684"
   )
   public void method2369(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)(var1 + 128);
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-11"
   )
   public int method2332() {
      this.field1693 += 2;
      return ((this.field1694[this.field1693 - 1] & 255) << 8) + (this.field1694[this.field1693 - 2] - 128 & 255);
   }

   @ObfuscatedName("p")
   public void method2371(long var1) {
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 40));
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 32));
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 24));
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 16));
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 8));
      this.field1694[++this.field1693 - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-5"
   )
   public int method2339() {
      int var1 = this.field1694[this.field1693] & 255;
      return var1 < 128?this.readUnsignedByte() - 64:this.readShort() - 49152;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1215602946"
   )
   public int method2268() {
      this.field1693 += 2;
      return ((this.field1694[this.field1693 - 1] & 255) << 8) + (this.field1694[this.field1693 - 2] & 255);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V",
      garbageValue = "-53"
   )
   public void method2279(BigInteger var1, BigInteger var2) {
      int var3 = this.field1693;
      this.field1693 = 0;
      byte[] var4 = new byte[var3];
      this.method2295(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.field1693 = 0;
      this.method2242(var7.length);
      this.method2251(var7, 0, var7.length);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-62"
   )
   public void method2253(int var1) {
      this.field1694[this.field1693 - var1 - 2] = (byte)(var1 >> 8);
      this.field1694[this.field1693 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1926143832"
   )
   public String method2264() {
      if(this.field1694[this.field1693] == 0) {
         ++this.field1693;
         return null;
      } else {
         return this.readString();
      }
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "50"
   )
   public int method2285() {
      return this.field1694[++this.field1693 - 1] - 128 & 255;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "807916187"
   )
   public void writeByte(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 24);
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 16);
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 8);
      this.field1694[++this.field1693 - 1] = (byte)var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1660024796"
   )
   public boolean method2439() {
      return (this.readUnsignedByte() & 1) == 1;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-639331412"
   )
   public void method2283(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)(0 - var1);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1281256485"
   )
   public void method2240() {
      if(this.field1694 != null) {
         class186.method3746(this.field1694);
      }

      this.field1694 = null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "124"
   )
   public void method2242(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 8);
      this.field1694[++this.field1693 - 1] = (byte)var1;
   }

   @ObfuscatedName("r")
   public void method2246(long var1) {
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 56));
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 48));
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 40));
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 32));
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 24));
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 16));
      this.field1694[++this.field1693 - 1] = (byte)((int)(var1 >> 8));
      this.field1694[++this.field1693 - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1829734035"
   )
   public void method2251(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.field1694[++this.field1693 - 1] = var1[var4];
      }

   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "510295331"
   )
   public int method2298() {
      this.field1693 += 2;
      int var1 = ((this.field1694[this.field1693 - 1] & 255) << 8) + (this.field1694[this.field1693 - 2] - 128 & 255);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "([IIII)V",
      garbageValue = "1529210597"
   )
   public void method2463(int[] var1, int var2, int var3) {
      int var4 = this.field1693;
      this.field1693 = var2;
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

         this.field1693 -= 8;
         this.writeByte(var7);
         this.writeByte(var8);
      }

      this.field1693 = var4;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "39"
   )
   public void method2247(boolean var1) {
      this.method2288(var1?1:0);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "652105887"
   )
   public void method2318(int var1) {
      if((var1 & -128) != 0) {
         if((var1 & -16384) != 0) {
            if((var1 & -2097152) != 0) {
               if((var1 & -268435456) != 0) {
                  this.method2288(var1 >>> 28 | 128);
               }

               this.method2288(var1 >>> 21 | 128);
            }

            this.method2288(var1 >>> 14 | 128);
         }

         this.method2288(var1 >>> 7 | 128);
      }

      this.method2288(var1 & 127);
   }

   public byte[] getPayload() {
      return this.field1694;
   }

   public int getOffset() {
      return this.field1693;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1633617537"
   )
   public int method2303() {
      this.field1693 += 4;
      return (this.field1694[this.field1693 - 4] & 255) + ((this.field1694[this.field1693 - 3] & 255) << 8) + ((this.field1694[this.field1693 - 2] & 255) << 16) + ((this.field1694[this.field1693 - 1] & 255) << 24);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1877577137"
   )
   public boolean method2281() {
      this.field1693 -= 4;
      int var1 = class36.method653(this.field1694, 0, this.field1693);
      int var2 = this.readInt();
      return var2 == var1;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1882579123"
   )
   public void method2282(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1067530287"
   )
   public void method2249(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field1694[++this.field1693 - 1] = 0;
         this.field1693 += class219.method4505(var1, 0, var1.length(), this.field1694, this.field1693);
         this.field1694[++this.field1693 - 1] = 0;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1664490613"
   )
   public int method2280(int var1) {
      int var2 = class36.method653(this.field1694, var1, this.field1693);
      this.writeByte(var2);
      return var2;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2093413461"
   )
   public int method2299() {
      this.field1693 += 3;
      return (this.field1694[this.field1693 - 3] & 255) + ((this.field1694[this.field1693 - 2] & 255) << 8) + ((this.field1694[this.field1693 - 1] & 255) << 16);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   public int readUnsignedByte() {
      return this.field1694[++this.field1693 - 1] & 255;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2046558421"
   )
   public int method2287() {
      return 128 - this.field1694[++this.field1693 - 1] & 255;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "842963668"
   )
   public void method2255(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)var1;
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "520366755"
   )
   public int method2260() {
      this.field1693 += 3;
      return ((this.field1694[this.field1693 - 3] & 255) << 16) + (this.field1694[this.field1693 - 1] & 255) + ((this.field1694[this.field1693 - 2] & 255) << 8);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1823533455"
   )
   public String readString() {
      int var1 = this.field1693;

      while(this.field1694[++this.field1693 - 1] != 0) {
         ;
      }

      int var2 = this.field1693 - var1 - 1;
      return var2 == 0?"":class225.method4566(this.field1694, var1, var2);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "147090242"
   )
   public int method2270() {
      int var1 = this.field1694[this.field1693] & 255;
      return var1 < 128?this.readUnsignedByte():this.readShort() - 32768;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1495660911"
   )
   public int method2293() {
      if(this.field1694[this.field1693] < 0) {
         return this.readInt() & Integer.MAX_VALUE;
      } else {
         int var1 = this.readShort();
         return var1 == 32767?-1:var1;
      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1970753705"
   )
   public int method2305() {
      this.field1693 += 4;
      return ((this.field1694[this.field1693 - 1] & 255) << 8) + ((this.field1694[this.field1693 - 4] & 255) << 16) + (this.field1694[this.field1693 - 2] & 255) + ((this.field1694[this.field1693 - 3] & 255) << 24);
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "163758376"
   )
   public byte method2296() {
      return (byte)(0 - this.field1694[++this.field1693 - 1]);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "1066388238"
   )
   public long method2349() {
      long var1 = (long)this.readInt() & 4294967295L;
      long var3 = (long)this.readInt() & 4294967295L;
      return var3 + (var1 << 32);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "970118866"
   )
   public void method2399(int var1) {
      this.field1694[this.field1693 - var1 - 4] = (byte)(var1 >> 24);
      this.field1694[this.field1693 - var1 - 3] = (byte)(var1 >> 16);
      this.field1694[this.field1693 - var1 - 2] = (byte)(var1 >> 8);
      this.field1694[this.field1693 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1840428759"
   )
   public void method2284(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)(128 - var1);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)V",
      garbageValue = "16711935"
   )
   public void method2250(CharSequence var1) {
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

      this.field1694[++this.field1693 - 1] = 0;
      this.method2318(var4);
      this.field1693 += class255.method5126(this.field1694, this.field1693, var1);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "32"
   )
   public String method2267() {
      byte var1 = this.field1694[++this.field1693 - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method2263();
         if(var2 + this.field1693 > this.field1694.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = class199.method3995(this.field1694, this.field1693, var2);
            this.field1693 += var2;
            return var3;
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1539377587"
   )
   public int method2315() {
      int var1 = 0;

      int var2;
      for(var2 = this.method2270(); var2 == 32767; var2 = this.method2270()) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1962567493"
   )
   public void method2300(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)var1;
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 8);
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 16);
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "1165888935"
   )
   public byte method2290() {
      return (byte)(128 - this.field1694[++this.field1693 - 1]);
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1807384811"
   )
   public void method2292(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 8);
      this.field1694[++this.field1693 - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "-1715335234"
   )
   public byte method2434() {
      return (byte)(this.field1694[++this.field1693 - 1] - 128);
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-56"
   )
   public void method2306(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = (byte)(this.field1694[++this.field1693 - 1] - 128);
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-115"
   )
   public void method2449(int var1) {
      if(var1 >= 0 && var1 < 128) {
         this.method2288(var1);
      } else if(var1 >= 0 && var1 < 32768) {
         this.method2242(var1 + 32768);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1628577912"
   )
   public String method2266() {
      byte var1 = this.field1694[++this.field1693 - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.field1693;

         while(this.field1694[++this.field1693 - 1] != 0) {
            ;
         }

         int var3 = this.field1693 - var2 - 1;
         return var3 == 0?"":class225.method4566(this.field1694, var2, var3);
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "([IIIB)V",
      garbageValue = "35"
   )
   public void method2277(int[] var1, int var2, int var3) {
      int var4 = this.field1693;
      this.field1693 = var2;
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

         this.field1693 -= 8;
         this.writeByte(var7);
         this.writeByte(var8);
      }

      this.field1693 = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1367310678"
   )
   public void method2412(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 16);
      this.field1694[++this.field1693 - 1] = (byte)(var1 >> 8);
      this.field1694[++this.field1693 - 1] = (byte)var1;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-9"
   )
   public int method2456() {
      this.field1693 += 2;
      int var1 = (this.field1694[this.field1693 - 1] & 255) + ((this.field1694[this.field1693 - 2] & 255) << 8);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "-2139456249"
   )
   public void method2275(int[] var1) {
      int var2 = this.field1693 / 8;
      this.field1693 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.readInt();
         int var5 = this.readInt();
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
            var6 += var7;
         }

         this.field1693 -= 8;
         this.writeByte(var4);
         this.writeByte(var5);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "925770886"
   )
   public void method2288(int var1) {
      this.field1694[++this.field1693 - 1] = (byte)var1;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1489307247"
   )
   public int method2286() {
      return 0 - this.field1694[++this.field1693 - 1] & 255;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "1008044673"
   )
   public void method2276(int[] var1) {
      int var2 = this.field1693 / 8;
      this.field1693 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.readInt();
         int var5 = this.readInt();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.field1693 -= 8;
         this.writeByte(var4);
         this.writeByte(var5);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Ljn;",
      garbageValue = "1655836393"
   )
   public static class241 method2472(int var0) {
      class241 var1 = (class241)class241.field3148.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class241.field3144.method4398(3, var0, -1263782348);
         var1 = new class241();
         if(var2 != null) {
            var1.method4739(new Buffer(var2));
         }

         class241.field3148.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lik;III)Lle;",
      garbageValue = "-857734859"
   )
   static class303 method2473(class217 var0, int var1, int var2) {
      byte[] var4 = var0.method4398(var1, var2, -1476342148);
      boolean var3;
      if(var4 == null) {
         var3 = false;
      } else {
         class253.method5080(var4);
         var3 = true;
      }

      if(!var3) {
         return null;
      } else {
         class303 var5 = new class303();
         var5.field3763 = class212.field2927;
         var5.field3764 = class212.field2924;
         var5.field3761 = class42.field476[0];
         var5.field3757 = class212.field2925[0];
         var5.field3759 = class212.field2922[0];
         var5.field3762 = class192.field2745[0];
         var5.field3758 = class225.field3040;
         var5.field3760 = class191.field2740[0];
         class42.field476 = null;
         class212.field2925 = null;
         class212.field2922 = null;
         class192.field2745 = null;
         class225.field3040 = null;
         class191.field2740 = null;
         return var5;
      }
   }
}
