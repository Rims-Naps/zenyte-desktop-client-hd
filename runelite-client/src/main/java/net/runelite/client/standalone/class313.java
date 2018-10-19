package net.runelite.client.standalone;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Reflection;

@ObfuscatedName("y")
public class class313 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   static final class313 field3379;
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field3372;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lle;"
   )
   static class32 field3373;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   static final class313 field3377;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1090993069
   )
   final int field3374;

   static {
      field3379 = new class313(0);
      field3377 = new class313(1);
   }

   class313(int var1) {
      this.field3374 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;I)V",
      garbageValue = "-1486835951"
   )
   public static void method5513(class148 var0, class148 var1) {
      class223.field2175 = var0;
      class223.field2184 = var1;
      class223.field2176 = class223.field2175.method2616(3);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgl;I)V",
      garbageValue = "2079168802"
   )
   public static void method5514(class214 var0) {
      class306 var1 = (class306)class36.field276.method1051();
      if(var1 != null) {
         int var2 = var0.field1073;
         var0.writeInt(var1.field3271);

         for(int var3 = 0; var3 < var1.field3270; ++var3) {
            if(var1.field3269[var3] != 0) {
               var0.writeByte(var1.field3269[var3]);
            } else {
               try {
                  int var4 = var1.field3268[var3];
                  Field var5;
                  int var6;
                  if(var4 == 0) {
                     var5 = var1.field3267[var3];
                     var6 = Reflection.getInt(var5, (Object)null);
                     var0.writeByte(0);
                     var0.writeInt(var6);
                  } else if(var4 == 1) {
                     var5 = var1.field3267[var3];
                     Reflection.setInt(var5, (Object)null, var1.field3266[var3]);
                     var0.writeByte(0);
                  } else if(var4 == 2) {
                     var5 = var1.field3267[var3];
                     var6 = var5.getModifiers();
                     var0.writeByte(0);
                     var0.writeInt(var6);
                  }

                  Method var25;
                  if(var4 != 3) {
                     if(var4 == 4) {
                        var25 = var1.field3272[var3];
                        var6 = var25.getModifiers();
                        var0.writeByte(0);
                        var0.writeInt(var6);
                     }
                  } else {
                     var25 = var1.field3272[var3];
                     byte[][] var10 = var1.field3273[var3];
                     Object[] var7 = new Object[var10.length];

                     for(int var8 = 0; var8 < var10.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var11 = Reflection.invoke(var25, (Object)null, var7);
                     if(var11 == null) {
                        var0.writeByte(0);
                     } else if(var11 instanceof Number) {
                        var0.writeByte(1);
                        var0.method1895(((Number)var11).longValue());
                     } else if(var11 instanceof String) {
                        var0.writeByte(2);
                        var0.writeString((String)var11);
                     } else {
                        var0.writeByte(4);
                     }
                  }
               } catch (ClassNotFoundException var13) {
                  var0.writeByte(-10);
               } catch (InvalidClassException var14) {
                  var0.writeByte(-11);
               } catch (StreamCorruptedException var15) {
                  var0.writeByte(-12);
               } catch (OptionalDataException var16) {
                  var0.writeByte(-13);
               } catch (IllegalAccessException var17) {
                  var0.writeByte(-14);
               } catch (IllegalArgumentException var18) {
                  var0.writeByte(-15);
               } catch (InvocationTargetException var19) {
                  var0.writeByte(-16);
               } catch (SecurityException var20) {
                  var0.writeByte(-17);
               } catch (IOException var21) {
                  var0.writeByte(-18);
               } catch (NullPointerException var22) {
                  var0.writeByte(-19);
               } catch (Exception var23) {
                  var0.writeByte(-20);
               } catch (Throwable var24) {
                  var0.writeByte(-21);
               }
            }
         }

         var0.method1929(var2);
         var1.method1186();
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Lhw;",
      garbageValue = "96"
   )
   public static class329 method5512(int var0, int var1) {
      class329 var2 = class189.getWidget(var0);
      return var1 == -1?var2:(var2 != null && var2.field3674 != null && var1 < var2.field3674.length?var2.field3674[var1]:null);
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "234497278"
   )
   static void method5511(int var0, int var1, int var2, int var3) {
      class329 var4 = method5512(var0, var1);
      if(var4 != null && var4.field3666 != null) {
         class9 var5 = new class9();
         var5.field63 = var4;
         var5.field69 = var4.field3666;
         class240.method4263(var5);
      }

      client.field3889 = var3;
      client.field3887 = true;
      class98.field914 = var0;
      client.field3888 = var1;
      class184.field1776 = var2;
      class184.method3216(var4);
   }
}
