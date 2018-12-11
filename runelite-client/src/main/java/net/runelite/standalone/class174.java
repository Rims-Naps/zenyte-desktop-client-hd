package net.runelite.standalone;

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
import net.runelite.rs.Reflection;

@ObfuscatedName("y")
public class class174 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   static final class174 field2131;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   static final class174 field2133;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lle;"
   )
   static class303 field2127;
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 worldMapIndex;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1090993069
   )
   final int field2128;

   static {
      field2133 = new class174(0);
      field2131 = new class174(1);
   }

   class174(int var1) {
      this.field2128 = var1;
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "234497278"
   )
   static void method3219(int var0, int var1, int var2, int var3) {
      class187 var4 = method3220(var0, var1);
      if(var4 != null && var4.field2680 != null) {
         class194 var5 = new class194();
         var5.field2759 = var4;
         var5.field2765 = var4.field2680;
         class209.method4198(var5);
      }

      client.field2310 = var3;
      client.field2308 = true;
      class28.field281 = var0;
      client.field2309 = var1;
      class230.field3072 = var2;
      class230.method4617(var4);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgl;I)V",
      garbageValue = "2079168802"
   )
   public static void method3222(class1 var0) {
      class121 var1 = (class121)class140.field1793.method745();
      if(var1 != null) {
         int var2 = var0.position;
         var0.writeByte(var1.field1648);

         for(int var3 = 0; var3 < var1.field1647; ++var3) {
            if(var1.field1646[var3] != 0) {
               var0.method2288(var1.field1646[var3]);
            } else {
               try {
                  int var4 = var1.field1645[var3];
                  Field var5;
                  int var6;
                  if(var4 == 0) {
                     var5 = var1.field1644[var3];
                     var6 = Reflection.getInt(var5, (Object)null);
                     var0.method2288(0);
                     var0.writeByte(var6);
                  } else if(var4 == 1) {
                     var5 = var1.field1644[var3];
                     Reflection.setInt(var5, (Object)null, var1.field1643[var3]);
                     var0.method2288(0);
                  } else if(var4 == 2) {
                     var5 = var1.field1644[var3];
                     var6 = var5.getModifiers();
                     var0.method2288(0);
                     var0.writeByte(var6);
                  }

                  Method var25;
                  if(var4 != 3) {
                     if(var4 == 4) {
                        var25 = var1.field1649[var3];
                        var6 = var25.getModifiers();
                        var0.method2288(0);
                        var0.writeByte(var6);
                     }
                  } else {
                     var25 = var1.field1649[var3];
                     byte[][] var10 = var1.field1650[var3];
                     Object[] var7 = new Object[var10.length];

                     for(int var8 = 0; var8 < var10.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var11 = Reflection.invoke(var25, (Object)null, var7);
                     if(var11 == null) {
                        var0.method2288(0);
                     } else if(var11 instanceof Number) {
                        var0.method2288(1);
                        var0.method2246(((Number)var11).longValue());
                     } else if(var11 instanceof String) {
                        var0.method2288(2);
                        var0.writeString((String)var11);
                     } else {
                        var0.method2288(4);
                     }
                  }
               } catch (ClassNotFoundException var13) {
                  var0.method2288(-10);
               } catch (InvalidClassException var14) {
                  var0.method2288(-11);
               } catch (StreamCorruptedException var15) {
                  var0.method2288(-12);
               } catch (OptionalDataException var16) {
                  var0.method2288(-13);
               } catch (IllegalAccessException var17) {
                  var0.method2288(-14);
               } catch (IllegalArgumentException var18) {
                  var0.method2288(-15);
               } catch (InvocationTargetException var19) {
                  var0.method2288(-16);
               } catch (SecurityException var20) {
                  var0.method2288(-17);
               } catch (IOException var21) {
                  var0.method2288(-18);
               } catch (NullPointerException var22) {
                  var0.method2288(-19);
               } catch (Exception var23) {
                  var0.method2288(-20);
               } catch (Throwable var24) {
                  var0.method2288(-21);
               }
            }
         }

         var0.method2280(var2);
         var1.method3937();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;I)V",
      garbageValue = "-1486835951"
   )
   public static void method3221(Js5Index var0, Js5Index var1) {
      class241.field3144 = var0;
      class241.field3153 = var1;
      class241.field3145 = class241.field3144.method4435(3);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Lhw;",
      garbageValue = "96"
   )
   public static class187 method3220(int var0, int var1) {
      class187 var2 = class48.method1047(var0);
      return var1 == -1?var2:(var2 != null && var2.field2688 != null && var1 < var2.field2688.length?var2.field2688[var1]:null);
   }
}
