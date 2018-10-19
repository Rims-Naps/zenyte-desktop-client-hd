package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class243 extends class3 {
   @ObfuscatedName("j")
   int field2434;
   @ObfuscatedName("f")
   int field2431;
   @ObfuscatedName("v")
   int field2432;
   @ObfuscatedName("m")
   int field2423;
   @ObfuscatedName("z")
   boolean field2421;
   @ObfuscatedName("r")
   int field2427;
   @ObfuscatedName("p")
   int field2426;
   @ObfuscatedName("c")
   int field2425;
   @ObfuscatedName("e")
   int field2420;
   @ObfuscatedName("x")
   int field2424;
   @ObfuscatedName("l")
   int field2422;
   @ObfuscatedName("s")
   int field2428;
   @ObfuscatedName("a")
   int field2430;
   @ObfuscatedName("g")
   int field2433;
   @ObfuscatedName("d")
   int field2429;

   @ObfuscatedSignature(
      signature = "(Lcr;III)V"
   )
   class243(class58 var1, int var2, int var3, int var4) {
      super.field28 = var1;
      this.field2423 = var1.field459;
      this.field2429 = var1.field457;
      this.field2421 = var1.field460;
      this.field2422 = var2;
      this.field2428 = var3;
      this.field2420 = var4;
      this.field2431 = 0;
      this.method4464();
   }

   @ObfuscatedSignature(
      signature = "(Lcr;II)V"
   )
   class243(class58 var1, int var2, int var3) {
      super.field28 = var1;
      this.field2423 = var1.field459;
      this.field2429 = var1.field457;
      this.field2421 = var1.field460;
      this.field2422 = var2;
      this.field2428 = var3;
      this.field2420 = 8192;
      this.field2431 = 0;
      this.method4464();
   }

   @ObfuscatedName("au")
   public synchronized int method4329() {
      return this.field2422 < 0?-this.field2422:this.field2422;
   }

   @ObfuscatedName("v")
   synchronized void method4318(int var1) {
      this.method4439(var1, this.method4419());
   }

   @ObfuscatedName("ay")
   int method4338(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.field2424 > 0) {
            int var6 = var2 + this.field2424;
            if(var6 > var4) {
               var6 = var4;
            }

            this.field2424 += var2;
            if(this.field2422 == -256 && (this.field2431 & 255) == 0) {
               if(class137.field1362) {
                  var2 = method4351(0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2425, this.field2426, this.field2433, this.field2434, 0, var6, var3, this);
               } else {
                  var2 = method4350(((class58)super.field28).field458, var1, this.field2431, var2, this.field2430, this.field2432, 0, var6, var3, this);
               }
            } else if(class137.field1362) {
               var2 = method4379(0, 0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2425, this.field2426, this.field2433, this.field2434, 0, var6, var3, this, this.field2422, var5);
            } else {
               var2 = method4354(0, 0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2430, this.field2432, 0, var6, var3, this, this.field2422, var5);
            }

            this.field2424 -= var2;
            if(this.field2424 != 0) {
               return var2;
            }

            if(!this.method4339()) {
               continue;
            }

            return var4;
         }

         if(this.field2422 == -256 && (this.field2431 & 255) == 0) {
            if(class137.field1362) {
               return method4343(0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2425, this.field2426, 0, var4, var3, this);
            }

            return method4342(((class58)super.field28).field458, var1, this.field2431, var2, this.field2430, 0, var4, var3, this);
         }

         if(class137.field1362) {
            return method4347(0, 0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2425, this.field2426, 0, var4, var3, this, this.field2422, var5);
         }

         return method4346(0, 0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2430, 0, var4, var3, this, this.field2422, var5);
      }
   }

   @ObfuscatedName("m")
   public synchronized void vmethod4966(int[] var1, int var2, int var3) {
      if(this.field2428 == 0 && this.field2424 == 0) {
         this.vmethod4968(var3);
      } else {
         class58 var4 = (class58)super.field28;
         int var5 = this.field2423 << 8;
         int var6 = this.field2429 << 8;
         int var7 = var4.field458.length << 8;
         int var8 = var6 - var5;
         if(var8 <= 0) {
            this.field2427 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if(this.field2431 < 0) {
            if(this.field2422 <= 0) {
               this.method4324();
               this.method1186();
               return;
            }

            this.field2431 = 0;
         }

         if(this.field2431 >= var7) {
            if(this.field2422 >= 0) {
               this.method4324();
               this.method1186();
               return;
            }

            this.field2431 = var7 - 1;
         }

         if(this.field2427 < 0) {
            if(this.field2421) {
               if(this.field2422 < 0) {
                  var9 = this.method4338(var1, var2, var5, var3, var4.field458[this.field2423]);
                  if(this.field2431 >= var5) {
                     return;
                  }

                  this.field2431 = var5 + var5 - 1 - this.field2431;
                  this.field2422 = -this.field2422;
               }

               while(true) {
                  var9 = this.method4337(var1, var9, var6, var3, var4.field458[this.field2429 - 1]);
                  if(this.field2431 < var6) {
                     return;
                  }

                  this.field2431 = var6 + var6 - 1 - this.field2431;
                  this.field2422 = -this.field2422;
                  var9 = this.method4338(var1, var9, var5, var3, var4.field458[this.field2423]);
                  if(this.field2431 >= var5) {
                     return;
                  }

                  this.field2431 = var5 + var5 - 1 - this.field2431;
                  this.field2422 = -this.field2422;
               }
            } else if(this.field2422 < 0) {
               while(true) {
                  var9 = this.method4338(var1, var9, var5, var3, var4.field458[this.field2429 - 1]);
                  if(this.field2431 >= var5) {
                     return;
                  }

                  this.field2431 = var6 - 1 - (var6 - 1 - this.field2431) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method4337(var1, var9, var6, var3, var4.field458[this.field2423]);
                  if(this.field2431 < var6) {
                     return;
                  }

                  this.field2431 = var5 + (this.field2431 - var5) % var8;
               }
            }
         } else {
            if(this.field2427 > 0) {
               if(this.field2421) {
                  label132: {
                     if(this.field2422 < 0) {
                        var9 = this.method4338(var1, var2, var5, var3, var4.field458[this.field2423]);
                        if(this.field2431 >= var5) {
                           return;
                        }

                        this.field2431 = var5 + var5 - 1 - this.field2431;
                        this.field2422 = -this.field2422;
                        if(--this.field2427 == 0) {
                           break label132;
                        }
                     }

                     do {
                        var9 = this.method4337(var1, var9, var6, var3, var4.field458[this.field2429 - 1]);
                        if(this.field2431 < var6) {
                           return;
                        }

                        this.field2431 = var6 + var6 - 1 - this.field2431;
                        this.field2422 = -this.field2422;
                        if(--this.field2427 == 0) {
                           break;
                        }

                        var9 = this.method4338(var1, var9, var5, var3, var4.field458[this.field2423]);
                        if(this.field2431 >= var5) {
                           return;
                        }

                        this.field2431 = var5 + var5 - 1 - this.field2431;
                        this.field2422 = -this.field2422;
                     } while(--this.field2427 != 0);
                  }
               } else {
                  int var10;
                  if(this.field2422 < 0) {
                     while(true) {
                        var9 = this.method4338(var1, var9, var5, var3, var4.field458[this.field2429 - 1]);
                        if(this.field2431 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field2431) / var8;
                        if(var10 >= this.field2427) {
                           this.field2431 += var8 * this.field2427;
                           this.field2427 = 0;
                           break;
                        }

                        this.field2431 += var8 * var10;
                        this.field2427 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method4337(var1, var9, var6, var3, var4.field458[this.field2423]);
                        if(this.field2431 < var6) {
                           return;
                        }

                        var10 = (this.field2431 - var5) / var8;
                        if(var10 >= this.field2427) {
                           this.field2431 -= var8 * this.field2427;
                           this.field2427 = 0;
                           break;
                        }

                        this.field2431 -= var8 * var10;
                        this.field2427 -= var10;
                     }
                  }
               }
            }

            if(this.field2422 < 0) {
               this.method4338(var1, var9, 0, var3, 0);
               if(this.field2431 < 0) {
                  this.field2431 = -1;
                  this.method4324();
                  this.method1186();
               }
            } else {
               this.method4337(var1, var9, var7, var3, 0);
               if(this.field2431 >= var7) {
                  this.field2431 = var7;
                  this.method4324();
                  this.method1186();
               }
            }

         }
      }
   }

   @ObfuscatedName("q")
   void method4324() {
      if(this.field2424 != 0) {
         if(this.field2428 == Integer.MIN_VALUE) {
            this.field2428 = 0;
         }

         this.field2424 = 0;
         this.method4464();
      }

   }

   @ObfuscatedName("z")
   public synchronized void vmethod4968(int var1) {
      if(this.field2424 > 0) {
         if(var1 >= this.field2424) {
            if(this.field2428 == Integer.MIN_VALUE) {
               this.field2428 = 0;
               this.field2426 = 0;
               this.field2425 = 0;
               this.field2430 = 0;
               this.method1186();
               var1 = this.field2424;
            }

            this.field2424 = 0;
            this.method4464();
         } else {
            this.field2430 += this.field2432 * var1;
            this.field2425 += this.field2433 * var1;
            this.field2426 += this.field2434 * var1;
            this.field2424 -= var1;
         }
      }

      class58 var2 = (class58)super.field28;
      int var3 = this.field2423 << 8;
      int var4 = this.field2429 << 8;
      int var5 = var2.field458.length << 8;
      int var6 = var4 - var3;
      if(var6 <= 0) {
         this.field2427 = 0;
      }

      if(this.field2431 < 0) {
         if(this.field2422 <= 0) {
            this.method4324();
            this.method1186();
            return;
         }

         this.field2431 = 0;
      }

      if(this.field2431 >= var5) {
         if(this.field2422 >= 0) {
            this.method4324();
            this.method1186();
            return;
         }

         this.field2431 = var5 - 1;
      }

      this.field2431 += this.field2422 * var1;
      if(this.field2427 < 0) {
         if(!this.field2421) {
            if(this.field2422 < 0) {
               if(this.field2431 >= var3) {
                  return;
               }

               this.field2431 = var4 - 1 - (var4 - 1 - this.field2431) % var6;
            } else {
               if(this.field2431 < var4) {
                  return;
               }

               this.field2431 = var3 + (this.field2431 - var3) % var6;
            }

         } else {
            if(this.field2422 < 0) {
               if(this.field2431 >= var3) {
                  return;
               }

               this.field2431 = var3 + var3 - 1 - this.field2431;
               this.field2422 = -this.field2422;
            }

            while(this.field2431 >= var4) {
               this.field2431 = var4 + var4 - 1 - this.field2431;
               this.field2422 = -this.field2422;
               if(this.field2431 >= var3) {
                  return;
               }

               this.field2431 = var3 + var3 - 1 - this.field2431;
               this.field2422 = -this.field2422;
            }

         }
      } else {
         if(this.field2427 > 0) {
            if(this.field2421) {
               label123: {
                  if(this.field2422 < 0) {
                     if(this.field2431 >= var3) {
                        return;
                     }

                     this.field2431 = var3 + var3 - 1 - this.field2431;
                     this.field2422 = -this.field2422;
                     if(--this.field2427 == 0) {
                        break label123;
                     }
                  }

                  do {
                     if(this.field2431 < var4) {
                        return;
                     }

                     this.field2431 = var4 + var4 - 1 - this.field2431;
                     this.field2422 = -this.field2422;
                     if(--this.field2427 == 0) {
                        break;
                     }

                     if(this.field2431 >= var3) {
                        return;
                     }

                     this.field2431 = var3 + var3 - 1 - this.field2431;
                     this.field2422 = -this.field2422;
                  } while(--this.field2427 != 0);
               }
            } else {
               label155: {
                  int var7;
                  if(this.field2422 < 0) {
                     if(this.field2431 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field2431) / var6;
                     if(var7 >= this.field2427) {
                        this.field2431 += var6 * this.field2427;
                        this.field2427 = 0;
                        break label155;
                     }

                     this.field2431 += var6 * var7;
                     this.field2427 -= var7;
                  } else {
                     if(this.field2431 < var4) {
                        return;
                     }

                     var7 = (this.field2431 - var3) / var6;
                     if(var7 >= this.field2427) {
                        this.field2431 -= var6 * this.field2427;
                        this.field2427 = 0;
                        break label155;
                     }

                     this.field2431 -= var6 * var7;
                     this.field2427 -= var7;
                  }

                  return;
               }
            }
         }

         if(this.field2422 < 0) {
            if(this.field2431 < 0) {
               this.field2431 = -1;
               this.method4324();
               this.method1186();
            }
         } else if(this.field2431 >= var5) {
            this.field2431 = var5;
            this.method4324();
            this.method1186();
         }

      }
   }

   @ObfuscatedName("r")
   protected int vmethod4965() {
      return this.field2428 == 0 && this.field2424 == 0?0:1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class3 vmethod4973() {
      return null;
   }

   @ObfuscatedName("u")
   public synchronized int method4320() {
      return this.field2428 == Integer.MIN_VALUE?0:this.field2428;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class3 vmethod4963() {
      return null;
   }

   @ObfuscatedName("e")
   void method4464() {
      this.field2430 = this.field2428;
      this.field2425 = method4381(this.field2428, this.field2420);
      this.field2426 = method4311(this.field2428, this.field2420);
   }

   @ObfuscatedName("x")
   public synchronized void method4317(int var1) {
      this.method4439(var1 << 6, this.method4419());
   }

   @ObfuscatedName("ae")
   public synchronized void method4327(int var1) {
      if(var1 == 0) {
         this.method4318(0);
         this.method1186();
      } else if(this.field2425 == 0 && this.field2426 == 0) {
         this.field2424 = 0;
         this.field2428 = 0;
         this.field2430 = 0;
         this.method1186();
      } else {
         int var2 = -this.field2430;
         if(this.field2430 > var2) {
            var2 = this.field2430;
         }

         if(-this.field2425 > var2) {
            var2 = -this.field2425;
         }

         if(this.field2425 > var2) {
            var2 = this.field2425;
         }

         if(-this.field2426 > var2) {
            var2 = -this.field2426;
         }

         if(this.field2426 > var2) {
            var2 = this.field2426;
         }

         if(var1 > var2) {
            var1 = var2;
         }

         this.field2424 = var1;
         this.field2428 = Integer.MIN_VALUE;
         this.field2432 = -this.field2430 / var1;
         this.field2433 = -this.field2425 / var1;
         this.field2434 = -this.field2426 / var1;
      }
   }

   @ObfuscatedName("ah")
   int vmethod4414() {
      int var1 = this.field2430 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.field2427 == 0) {
         var1 -= var1 * this.field2431 / (((class58)super.field28).field458.length << 8);
      } else if(this.field2427 >= 0) {
         var1 -= var1 * this.field2423 / ((class58)super.field28).field458.length;
      }

      return var1 > 255?255:var1;
   }

   @ObfuscatedName("o")
   public synchronized int method4419() {
      return this.field2420 < 0?-1:this.field2420;
   }

   @ObfuscatedName("g")
   synchronized void method4439(int var1, int var2) {
      this.field2428 = var1;
      this.field2420 = var2;
      this.field2424 = 0;
      this.method4464();
   }

   @ObfuscatedName("ai")
   public boolean method4404() {
      return this.field2424 != 0;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Z)V",
      garbageValue = "1"
   )
   public synchronized void method4370() {
      this.field2422 = (this.field2422 ^ this.field2422 >> 31) + (this.field2422 >>> 31);
      this.field2422 = -this.field2422;
   }

   @ObfuscatedName("ak")
   boolean method4339() {
      int var1 = this.field2428;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method4381(var1, this.field2420);
         var3 = method4311(var1, this.field2420);
      }

      if(var1 == this.field2430 && var2 == this.field2425 && var3 == this.field2426) {
         if(this.field2428 == Integer.MIN_VALUE) {
            this.field2428 = 0;
            this.field2426 = 0;
            this.field2425 = 0;
            this.field2430 = 0;
            this.method1186();
            return true;
         } else {
            this.method4464();
            return false;
         }
      } else {
         if(this.field2430 < var1) {
            this.field2432 = 1;
            this.field2424 = var1 - this.field2430;
         } else if(this.field2430 > var1) {
            this.field2432 = -1;
            this.field2424 = this.field2430 - var1;
         } else {
            this.field2432 = 0;
         }

         if(this.field2425 < var2) {
            this.field2433 = 1;
            if(this.field2424 == 0 || this.field2424 > var2 - this.field2425) {
               this.field2424 = var2 - this.field2425;
            }
         } else if(this.field2425 > var2) {
            this.field2433 = -1;
            if(this.field2424 == 0 || this.field2424 > this.field2425 - var2) {
               this.field2424 = this.field2425 - var2;
            }
         } else {
            this.field2433 = 0;
         }

         if(this.field2426 < var3) {
            this.field2434 = 1;
            if(this.field2424 == 0 || this.field2424 > var3 - this.field2426) {
               this.field2424 = var3 - this.field2426;
            }
         } else if(this.field2426 > var3) {
            this.field2434 = -1;
            if(this.field2424 == 0 || this.field2424 > this.field2426 - var3) {
               this.field2424 = this.field2426 - var3;
            }
         } else {
            this.field2434 = 0;
         }

         return false;
      }
   }

   @ObfuscatedName("an")
   int method4337(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.field2424 > 0) {
            int var6 = var2 + this.field2424;
            if(var6 > var4) {
               var6 = var4;
            }

            this.field2424 += var2;
            if(this.field2422 == 256 && (this.field2431 & 255) == 0) {
               if(class137.field1362) {
                  var2 = method4349(0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2425, this.field2426, this.field2433, this.field2434, 0, var6, var3, this);
               } else {
                  var2 = method4411(((class58)super.field28).field458, var1, this.field2431, var2, this.field2430, this.field2432, 0, var6, var3, this);
               }
            } else if(class137.field1362) {
               var2 = method4353(0, 0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2425, this.field2426, this.field2433, this.field2434, 0, var6, var3, this, this.field2422, var5);
            } else {
               var2 = method4352(0, 0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2430, this.field2432, 0, var6, var3, this, this.field2422, var5);
            }

            this.field2424 -= var2;
            if(this.field2424 != 0) {
               return var2;
            }

            if(!this.method4339()) {
               continue;
            }

            return var4;
         }

         if(this.field2422 == 256 && (this.field2431 & 255) == 0) {
            if(class137.field1362) {
               return method4341(0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2425, this.field2426, 0, var4, var3, this);
            }

            return method4335(((class58)super.field28).field458, var1, this.field2431, var2, this.field2430, 0, var4, var3, this);
         }

         if(class137.field1362) {
            return method4345(0, 0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2425, this.field2426, 0, var4, var3, this, this.field2422, var5);
         }

         return method4344(0, 0, ((class58)super.field28).field458, var1, this.field2431, var2, this.field2430, 0, var4, var3, this, this.field2422, var5);
      }
   }

   @ObfuscatedName("i")
   public synchronized void method4322(int var1) {
      int var2 = ((class58)super.field28).field458.length << 8;
      if(var1 < -1) {
         var1 = -1;
      }

      if(var1 > var2) {
         var1 = var2;
      }

      this.field2431 = var1;
   }

   @ObfuscatedName("aj")
   public boolean method4330() {
      return this.field2431 < 0 || this.field2431 >= ((class58)super.field28).field458.length << 8;
   }

   @ObfuscatedName("ap")
   public synchronized void method4328(int var1) {
      if(this.field2422 < 0) {
         this.field2422 = -var1;
      } else {
         this.field2422 = var1;
      }

   }

   @ObfuscatedName("y")
   public synchronized void method4325(int var1, int var2) {
      this.method4407(var1, var2, this.method4419());
   }

   @ObfuscatedName("d")
   public synchronized void method4316(int var1) {
      this.field2427 = var1;
   }

   @ObfuscatedName("av")
   public synchronized void method4407(int var1, int var2, int var3) {
      if(var1 == 0) {
         this.method4439(var2, var3);
      } else {
         int var4 = method4381(var2, var3);
         int var5 = method4311(var2, var3);
         if(var4 == this.field2425 && var5 == this.field2426) {
            this.field2424 = 0;
         } else {
            int var6 = var2 - this.field2430;
            if(this.field2430 - var2 > var6) {
               var6 = this.field2430 - var2;
            }

            if(var4 - this.field2425 > var6) {
               var6 = var4 - this.field2425;
            }

            if(this.field2425 - var4 > var6) {
               var6 = this.field2425 - var4;
            }

            if(var5 - this.field2426 > var6) {
               var6 = var5 - this.field2426;
            }

            if(this.field2426 - var5 > var6) {
               var6 = this.field2426 - var5;
            }

            if(var1 > var6) {
               var1 = var6;
            }

            this.field2424 = var1;
            this.field2428 = var2;
            this.field2420 = var3;
            this.field2432 = (var2 - this.field2430) / var1;
            this.field2433 = (var4 - this.field2425) / var1;
            this.field2434 = (var5 - this.field2426) / var1;
         }
      }
   }

   @ObfuscatedName("f")
   static int method4381(int var0, int var1) {
      return var1 < 0?var0:(int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdl;II)I"
   )
   static int method4345(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class243 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field2431 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIILdl;II)I"
   )
   static int method4344(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class243 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field2431 = var4;
      return var5;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIIIILdl;)I"
   )
   static int method4349(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class243 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var11 + var4 - var3) > var10) {
         var9 = var10;
      }

      var12.field2430 += var12.field2432 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field2425 = var5 >> 2;
      var12.field2426 = var6 >> 2;
      var12.field2431 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIILdl;)I"
   )
   static int method4335(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class243 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.field2431 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIIILdl;)I"
   )
   static int method4411(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class243 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field2425 += var9.field2433 * (var6 - var3);
      var9.field2426 += var9.field2434 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.field2430 = var4 >> 2;
      var9.field2431 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdl;II)I"
   )
   static int method4354(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class243 var11, int var12, int var13) {
      var11.field2425 -= var11.field2433 * var5;
      var11.field2426 -= var11.field2434 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field2425 += var11.field2433 * var5;
      var11.field2426 += var11.field2434 * var5;
      var11.field2430 = var6;
      var11.field2431 = var4;
      return var5;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdl;II)I"
   )
   static int method4352(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class243 var11, int var12, int var13) {
      var11.field2425 -= var11.field2433 * var5;
      var11.field2426 -= var11.field2434 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field2425 += var11.field2433 * var5;
      var11.field2426 += var11.field2434 * var5;
      var11.field2430 = var6;
      var11.field2431 = var4;
      return var5;
   }

   @ObfuscatedName("l")
   static int method4311(int var0, int var1) {
      return var1 < 0?-var0:(int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lcr;III)Ldl;"
   )
   public static class243 method4315(class58 var0, int var1, int var2, int var3) {
      return var0.field458 != null && var0.field458.length != 0?new class243(var0, var1, var2, var3):null;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIIILdl;)I"
   )
   static int method4350(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class243 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field2425 += var9.field2433 * (var6 - var3);
      var9.field2426 += var9.field2434 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.field2430 = var4 >> 2;
      var9.field2431 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIIIILdl;II)I"
   )
   static int method4379(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class243 var13, int var14, int var15) {
      var13.field2430 -= var5 * var13.field2432;
      if(var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field2430 += var13.field2432 * var5;
      var13.field2425 = var6;
      var13.field2426 = var7;
      var13.field2431 = var4;
      return var5;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIILdl;)I"
   )
   static int method4341(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class243 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field2431 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lcr;II)Ldl;"
   )
   public static class243 method4313(class58 var0, int var1, int var2) {
      return var0.field458 != null && var0.field458.length != 0?new class243(var0, (int)((long)var0.field461 * 256L * (long)var1 / (long)(class40.field294 * 100)), var2 << 6):null;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIIIILdl;II)I"
   )
   static int method4353(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class243 var13, int var14, int var15) {
      var13.field2430 -= var5 * var13.field2432;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field2430 += var13.field2432 * var5;
      var13.field2425 = var6;
      var13.field2426 = var7;
      var13.field2431 = var4;
      return var5;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIIIILdl;)I"
   )
   static int method4351(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class243 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var3 + var4 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field2430 += var12.field2432 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field2425 = var5 >> 2;
      var12.field2426 = var6 >> 2;
      var12.field2431 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIILdl;II)I"
   )
   static int method4346(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class243 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field2431 = var4;
      return var5;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdl;II)I"
   )
   static int method4347(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class243 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field2431 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIILdl;)I"
   )
   static int method4343(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class243 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var3 + var4 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field2431 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIILdl;)I"
   )
   static int method4342(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class243 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.field2431 = var2 << 8;
      return var3;
   }
}
