import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _debuglib extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue print$1 = env.get(print);
      final LuaValue tostring$2 = env.get(tostring$1);
      final LuaValue _G$1 = env.get(_G);
      final LuaValue pcall$1 = env.get(pcall);
      final LuaValue ipairs$1 = env.get(ipairs);
      final LuaValue isnumber$2 = env.get(isnumber$1);
      LuaValue e = NIL;
      final LuaValue[] f = {NIL};
      final LuaValue[] g = {NIL};
      final LuaValue[] h = {NIL};
      final LuaValue[] s = {NIL};
      print$1.call(has_debu,env.get(debug).neq(NIL));
      if ( (!env.get(debug).toboolean()) ) {
         env.get(error$1).call(no_debug);
      }
      print$1.call(______de);
      f[0] = new OneArgFunction(env) {
         public LuaValue call(LuaValue a) {
            return f_.concat(tostring$2.call(a).concat(_.concat(tostring$2.call(env.get(b)).buffer()))).value();
         }
      };
      final Varargs v = pcall$1.invoke(varargsOf(env.get(debug).get(getfenv$1),f[0]));
      s[0] = v.arg1();
      e = v.arg(2);
      g[0] = v.arg(3);
      print$1.invoke(varargsOf(new LuaValue[] {s[0],env.get(type$1).call(e),env.get(type$1).call(g[0]),e.eq(env.get(G)),},pcall$1.invoke(varargsOf(f[0],abc))));
      final Varargs v$1 = pcall$1.invoke(varargsOf(env.get(debug).get(setfenv$1),f[0],LuaValue.tableOf(new LuaValue[]{b,def,})));
      s[0] = v$1.arg1();
      e = v$1.arg(2);
      g[0] = v$1.arg(3);
      print$1.invoke(varargsOf(new LuaValue[] {s[0],env.get(type$1).call(e),env.get(type$1).call(g[0]),e.eq(env.get(G)),},pcall$1.invoke(varargsOf(f[0],abc))));
      final Varargs v$2 = pcall$1.invoke(varargsOf(env.get(debug).get(getfenv$1),f[0]));
      s[0] = v$2.arg1();
      e = v$2.arg(2);
      g[0] = v$2.arg(3);
      print$1.invoke(varargsOf(new LuaValue[] {s[0],env.get(type$1).call(e),env.get(type$1).call(g[0]),e.eq(env.get(G)),},pcall$1.invoke(varargsOf(f[0],abc))));
      print$1.call(______de$1);
      h[0] = new ThreeArgFunction(env) {
         public LuaValue call(LuaValue v$3,LuaValue i,LuaValue n) {
            s[0] = h_.concat(v$3.concat(_$1.concat(i.buffer()))).value();
            final Varargs t = env.get(debug).get(getlocal).invoke(varargsOf(v$3,i));
            final LuaValue x1 = t.arg1();
            final LuaValue y1 = t.arg(2);
            final Varargs t$1 = env.get(debug).get(setlocal).invoke(varargsOf(v$3,i,n));
            final LuaValue x2 = t$1.arg1();
            final LuaValue y2 = t$1.arg(2);
            final Varargs t$2 = env.get(debug).get(getlocal).invoke(varargsOf(v$3,i));
            final LuaValue x3 = t$2.arg1();
            final LuaValue y3 = t$2.arg(2);
            return s[0].concat(____.concat(v$3.concat(_$1.concat(i.concat(_$2.concat(get_.concat(tostring$2.call(x1).concat(_$3.concat(tostring$2.call(y1).concat(_$2.concat(set_.concat(tostring$2.call(x2).concat(_$3.concat(tostring$2.call(y2).concat(_$2.concat(get_.concat(tostring$2.call(x3).concat(_$3.concat(tostring$2.call(y3).concat(_$2.buffer())))))))))))))))))))).value();
         }
      };
      g[0] = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            final LuaValue t = h[0].invoke($arg).arg1();
            final LuaValue b$1 = env.get(table).get(concat$1).call(LuaValue.listOf(new LuaValue[]{}, $arg),_$3);
            return t.concat(_g_local.concat(_7.concat(_$3.concat(_8.concat(_$3.concat(_9.concat(_tbl__.concat(b$1.concat(_$4.buffer()))))))))).value();
         }
      };
      f[0] = new ThreeArgFunction(env) {
         public LuaValue call(LuaValue a,LuaValue b$1,LuaValue c) {
            final LuaValue t = g[0].call(a,b$1,c);
            return t.concat(_f_local.concat(_$3.concat(a.concat(_$3.concat(b$1.concat(_$3.concat(c.concat(_$3.concat(_4.concat(_$3.concat(_5.concat(_$3.concat(_6.buffer()))))))))))))).value();
         }
      };
      for ( double lvl$0=_3.checkdouble(), lvl$limit=_2.checkdouble(), lvl$step=ONE.neg().checkdouble(); lvl$step>0? (lvl$0<=lvl$limit): (lvl$0>=lvl$limit); lvl$0+=lvl$step ) {
         final LuaValue lvl = valueOf(lvl$0);
         for ( double lcl$0=ZERO.checkdouble(), lcl$limit=_7.checkdouble(); lcl$0<=lcl$limit; ++lcl$0 ) {
            final LuaValue lcl = valueOf(lcl$0);
            print$1.invoke(pcall$1.invoke(varargsOf(new LuaValue[] {f[0],lvl,lcl,},_$5)));
         }
      }
      for ( double lvl$1$0=ONE.checkdouble(), lvl$1$limit=ONE.checkdouble(); lvl$1$0<=lvl$1$limit; ++lvl$1$0 ) {
         final LuaValue lvl$1 = valueOf(lvl$1$0);
         for ( double lcl$1$0=_3.checkdouble(), lcl$1$limit=_7.checkdouble(); lcl$1$0<=lcl$1$limit; ++lcl$1$0 ) {
            final LuaValue lcl$1 = valueOf(lcl$1$0);
            print$1.invoke(pcall$1.invoke(varargsOf(new LuaValue[] {f[0],lvl$1,lcl$1,},_$5)));
         }
      }
      print$1.call(______de$2);
      f[0] = new ThreeArgFunction(env) {
         public LuaValue call(LuaValue p,LuaValue q,LuaValue r) {
            final LuaValue g$1 = new ThreeArgFunction(env) {
               public LuaValue call(LuaValue s$1,LuaValue t,LuaValue u) {
                  return new VarArgFunction(env) {
                     public Varargs invoke(Varargs $arg) {
                        return varargsOf(new LuaValue[] {_101,_102,_103,_104,_105,_106,_107,_108,},_109);
                     }
                  };
               }
            };
            return g$1;
         }
      };
      g[0] = f[0].call();
      h[0] = g[0].call();
      final LuaValue callh = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue t = LuaValue.tableOf();
            LuaValue f$1,s$1,var;
            Varargs v$3;
            final Varargs v$4 = ipairs$1.invoke(LuaValue.listOf(new LuaValue[]{}, pcall$1.invoke(h[0])));
            f$1 = v$4.arg1();
            s$1 = v$4.arg(2);
            var = v$4.arg(3);
            while (true) {
               v$3 = f$1.invoke(varargsOf(s$1,var));
               if ((var=v$3.arg1()).isnil()) break;
               final LuaValue i = var;
               final LuaValue v$5 = v$3.arg(2);
               t.set(i,tostring$2.call(v$5));
            }
            return new TailcallVarargs(env.get(table).get(concat$1),varargsOf(t,_$3));
         }
      };
      print$1.invoke(varargsOf(h$1,h[0].invoke()));
      final LuaValue funs = LuaValue.listOf(new LuaValue[]{f[0],g[0],h[0],});
      final LuaValue names = LuaValue.listOf(new LuaValue[]{f$1,g$1,h$1,});
      for ( double i$0=ONE.checkdouble(), i$limit=_3.checkdouble(); i$0<=i$limit; ++i$0 ) {
         final LuaValue i = valueOf(i$0);
         final LuaValue fun = funs.get(i);
         final LuaValue name$1 = names.get(i);
         for ( double index$0=ZERO.checkdouble(), index$limit=_10.checkdouble(); index$0<=index$limit; ++index$0 ) {
            final LuaValue index = valueOf(index$0);
            final Varargs t = pcall$1.invoke(varargsOf(env.get(debug).get(getupval),fun,index));
            final LuaValue s1 = t.arg1();
            final LuaValue x1 = t.arg(2);
            final LuaValue y1 = t.arg(3);
            final Varargs t$1 = pcall$1.invoke(varargsOf(new LuaValue[] {env.get(debug).get(setupval),fun,index,},valueOf((666000+(i.checkdouble()*111000))+index.checkdouble())));
            final LuaValue s2 = t$1.arg1();
            final LuaValue x2 = t$1.arg(2);
            final LuaValue y2 = t$1.arg(3);
            final Varargs t$2 = pcall$1.invoke(varargsOf(env.get(debug).get(getupval),fun,index));
            final LuaValue s3 = t$2.arg1();
            final LuaValue x3 = t$2.arg(2);
            final LuaValue y3 = t$2.arg(3);
            print$1.call(name$1.concat(____.concat(i.concat(_$1.concat(index.concat(_$2.concat(get_.concat(tostring$2.call(s1).concat(_$3.concat(tostring$2.call(x1).concat(_$3.concat(tostring$2.call(y1).concat(_$2.concat(set_.concat(tostring$2.call(s2).concat(_$3.concat(tostring$2.call(x2).concat(_$3.concat(tostring$2.call(y2).concat(_$2.concat(get_.concat(tostring$2.call(s3).concat(_$3.concat(tostring$2.call(x3).concat(_$3.concat(tostring$2.call(y3).concat(_$2.concat(tbl_.concat(callh.call().buffer())))))))))))))))))))))))))))).value());
         }
      }
      print$1.call(______de$3);
      final LuaValue a$1 = LuaValue.tableOf(new LuaValue[]{a,bbb,});
      final LuaValue b$1 = LuaValue.tableOf();
      final LuaValue mt = LuaValue.tableOf(new LuaValue[]{__index,LuaValue.tableOf(new LuaValue[]{b,ccc,}),});
      print$1.call(a_a_.concat(tostring$2.call(a$1.get(a)).concat(_a_b_.concat(tostring$2.call(a$1.get(b)).concat(_b_a_.concat(tostring$2.call(b$1.get(a)).concat(_b_b_.concat(tostring$2.call(b$1.get(b)).buffer()))))))).value());
      final Varargs t$3 = pcall$1.invoke(varargsOf(env.get(debug).get(getmetat),a$1));
      final LuaValue s1$1 = t$3.arg1();
      final LuaValue x1$1 = t$3.arg(2);
      final LuaValue y1$1 = t$3.arg(3);
      final Varargs t$4 = pcall$1.invoke(varargsOf(env.get(debug).get(setmetat),a$1,mt));
      final LuaValue s2$1 = t$4.arg1();
      final LuaValue x2$1 = t$4.arg(2);
      final LuaValue y2$1 = t$4.arg(3);
      print$1.call(a_a_.concat(tostring$2.call(a$1.get(a)).concat(_a_b_.concat(tostring$2.call(a$1.get(b)).concat(_b_a_.concat(tostring$2.call(b$1.get(a)).concat(_b_b_.concat(tostring$2.call(b$1.get(b)).buffer()))))))).value());
      final Varargs t$5 = pcall$1.invoke(varargsOf(env.get(debug).get(getmetat),a$1));
      final LuaValue s3$1 = t$5.arg1();
      final LuaValue x3$1 = t$5.arg(2);
      final LuaValue y3$1 = t$5.arg(3);
      final Varargs t$6 = pcall$1.invoke(varargsOf(env.get(debug).get(getmetat),b$1));
      final LuaValue s4 = t$6.arg1();
      final LuaValue x4 = t$6.arg(2);
      final LuaValue y4 = t$6.arg(3);
      final Varargs t$7 = pcall$1.invoke(varargsOf(env.get(debug).get(setmetat),a$1,NIL));
      final LuaValue s5 = t$7.arg1();
      final LuaValue x5 = t$7.arg(2);
      final LuaValue y5 = t$7.arg(3);
      print$1.call(a_a_.concat(tostring$2.call(a$1.get(a)).concat(_a_b_.concat(tostring$2.call(a$1.get(b)).concat(_b_a_.concat(tostring$2.call(b$1.get(a)).concat(_b_b_.concat(tostring$2.call(b$1.get(b)).buffer()))))))).value());
      final Varargs t$8 = pcall$1.invoke(varargsOf(env.get(debug).get(getmetat),a$1));
      final LuaValue s6 = t$8.arg1();
      final LuaValue x6 = t$8.arg(2);
      final LuaValue y6 = t$8.arg(3);
      if ( (!s1$1.toboolean()) ) {
         print$1.call(s1_error,x1$1);
      }
      if ( (!s2$1.toboolean()) ) {
         print$1.call(s2_error,x2$1);
      }
      if ( (!s3$1.toboolean()) ) {
         print$1.call(s3_error,x3$1);
      }
      if ( (!s4.toboolean()) ) {
         print$1.call(s4_error,x4);
      }
      if ( (!s5.toboolean()) ) {
         print$1.call(s5_error,x5);
      }
      if ( (!s6.toboolean()) ) {
         print$1.call(s6_error,x6);
      }
      print$1.call(get_.concat(tostring$2.call(s1$1).concat(_$3.concat(tostring$2.call(x1$1.eq(NIL)).concat(_$3.concat(tostring$2.call(y1$1).buffer()))))).value());
      print$1.call(set_.concat(tostring$2.call(s2$1).concat(_$3.concat(tostring$2.call(x2$1.eq(a$1)).concat(_$3.concat(tostring$2.call(y2$1).buffer()))))).value());
      print$1.call(get_.concat(tostring$2.call(s3$1).concat(_$3.concat(tostring$2.call(x3$1.eq(mt)).concat(_$3.concat(tostring$2.call(y3$1).buffer()))))).value());
      print$1.call(get_.concat(tostring$2.call(s4).concat(_$3.concat(tostring$2.call(x4.eq(NIL)).concat(_$3.concat(tostring$2.call(y4).buffer()))))).value());
      print$1.call(set_.concat(tostring$2.call(s5).concat(_$3.concat(tostring$2.call(x5.eq(a$1)).concat(_$3.concat(tostring$2.call(y5).buffer()))))).value());
      print$1.call(get_.concat(tostring$2.call(s6).concat(_$3.concat(tostring$2.call(x6.eq(NIL)).concat(_$3.concat(tostring$2.call(y6).buffer()))))).value());
      print$1.invoke(pcall$1.invoke(varargsOf(env.get(debug).get(getmetat),ONE)));
      print$1.invoke(pcall$1.invoke(varargsOf(env.get(debug).get(setmetat),ONE,LuaValue.tableOf())));
      print$1.invoke(pcall$1.invoke(varargsOf(env.get(debug).get(setmetat),ONE,NIL)));
      print$1.call(______de$4);
      final LuaValue printfield = new TwoArgFunction(env) {
         public LuaValue call(LuaValue tbl,LuaValue field) {
            LuaValue x = tbl.get(field);
            if ( x.eq_b(NIL) ) {
               return NONE;
            }
            final LuaValue typ = env.get(type$1).call(x);
            if ( typ.eq_b(table) ) {
               x = _$6.concat(env.get(table).get(concat$1).call(x,_$3).concat(_$4.buffer())).value();
            } else if ( typ.eq_b(function) ) {
               x = typ;
            }
            print$1.call(____$1.concat(field.concat(__.concat(tostring$2.call(x).buffer()))).value());
            return NONE;
         }
      };
      final LuaValue fields = LuaValue.listOf(new LuaValue[]{source,short_sr,what,currentl,linedefi,lastline,nups,func,activeli,});
      final LuaValue printinfo = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = LuaValue.tableOf($arg,1);
            LuaValue f$2,s$1,var;
            Varargs v$3;
            final Varargs v$4 = ipairs$1.invoke(arg);
            f$2 = v$4.arg1();
            s$1 = v$4.arg(2);
            var = v$4.arg(3);
            while (true) {
               v$3 = f$2.invoke(varargsOf(s$1,var));
               if ((var=v$3.arg1()).isnil()) break;
               final LuaValue i$1 = var;
               final LuaValue a$2 = v$3.arg(2);
               if ( env.get(type$1).call(a$2).eq_b(table) ) {
                  LuaValue f$3,s$2,var$1;
                  Varargs v$5;
                  final Varargs v$6 = ipairs$1.invoke(fields);
                  f$3 = v$6.arg1();
                  s$2 = v$6.arg(2);
                  var$1 = v$6.arg(3);
                  while (true) {
                     v$5 = f$3.invoke(varargsOf(s$2,var$1));
                     if ((var$1=v$5.arg1()).isnil()) break;
                     final LuaValue j = var$1;
                     final LuaValue field = v$5.arg(2);
                     printfield.call(a$2,field);
                  }
               } else {
                  print$1.invoke(tostring$2.invoke(a$2));
               }
            }
            return NONE;
         }
      };
      env.set(test,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue[] x = {_5};
            f[0] = new ZeroArgFunction(env) {
               public LuaValue call() {
                  x[0] = valueOf(x[0].checkdouble()+1);
                  return x[0];
               }
            };
            g[0] = new ZeroArgFunction(env) {
               public LuaValue call() {
                  x[0] = valueOf(x[0].checkdouble()-1);
                  print$1.call(___);
                  printinfo.invoke(varargsOf(debug_ge,env.get(debug).get(getinfo).invoke(ONE)));
                  printinfo.invoke(varargsOf(debug_ge$1,env.get(debug).get(getinfo).invoke(varargsOf(ONE,_$7))));
                  printinfo.invoke(varargsOf(debug_ge$2,env.get(debug).get(getinfo).invoke(varargsOf(ONE,l))));
                  printinfo.invoke(varargsOf(debug_ge$3,env.get(debug).get(getinfo).invoke(varargsOf(ONE,fL))));
                  printinfo.invoke(varargsOf(debug_ge$4,env.get(debug).get(getinfo).invoke(_2)));
                  printinfo.invoke(varargsOf(debug_ge$5,env.get(debug).get(getinfo).invoke(varargsOf(_2,l))));
                  printinfo.invoke(varargsOf(debug_ge$6,env.get(debug).get(getinfo).invoke(varargsOf(_2,fL))));
                  printinfo.invoke(varargsOf(debug_ge$7,pcall$1.invoke(varargsOf(env.get(debug).get(getinfo),_10,_$7))));
                  printinfo.invoke(varargsOf(debug_ge$8,pcall$1.invoke(varargsOf(env.get(debug).get(getinfo),_10.neg(),_$7))));
                  print$1.call(___);
                  return x[0];
               }
            };
            print$1.invoke(f[0].invoke());
            print$1.invoke(g[0].invoke());
            return varargsOf(f[0],g[0]);
         }
      });
      final Varargs t$9 = pcall$1.invoke(env.get(test));
      final LuaValue e$1 = t$9.arg1();
      final LuaValue[] f$2 = {t$9.arg(2)};
      final LuaValue[] g$2 = {t$9.arg(3)};
      print$1.invoke(varargsOf(new LuaValue[] {e_f_g,e$1,env.get(type$1).call(f$2[0]),},env.get(type$1).invoke(g$2[0])));
      printinfo.invoke(varargsOf(debug_ge$9,pcall$1.invoke(varargsOf(env.get(debug).get(getinfo),f$2[0]))));
      printinfo.invoke(varargsOf(debug_ge$10.concat(nSlufL.concat(__$1.buffer())).value(),pcall$1.invoke(varargsOf(env.get(debug).get(getinfo),f$2[0],nSlufL))));
      for ( double j$0=ONE.checkdouble(), j$limit=_6.checkdouble(); j$0<=j$limit; ++j$0 ) {
         final LuaValue j = valueOf(j$0);
         final LuaValue opts = nSlufL.method(sub$1,j,j);
         printinfo.invoke(varargsOf(debug_ge$10.concat(opts.concat(__$1.buffer())).value(),pcall$1.invoke(varargsOf(env.get(debug).get(getinfo),f$2[0],opts))));
      }
      printinfo.invoke(varargsOf(debug_ge$11,pcall$1.invoke(varargsOf(env.get(debug).get(getinfo),g$2[0]))));
      printinfo.invoke(varargsOf(debug_ge$12,pcall$1.invoke(varargsOf(env.get(debug).get(getinfo),env.get(test)))));
      print$1.call(______de$5);
      f$2[0] = new OneArgFunction(env) {
         public LuaValue call(LuaValue x$0) {
            final LuaValue x = x$0;
            g$2[0] = new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue y = $arg.arg1();
                  return new TailcallVarargs(env.get(math).get(min),varargsOf(x,h[0]));
               }
            };
            final LuaValue a$2 = g$2[0].call(x);
            return valueOf(a$2.checkdouble()+a$2.checkdouble());
         }
      };
      final LuaValue hook = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            print$1.invoke(varargsOf(_______i,$arg));
            final LuaValue info = env.get(debug).get(getinfo).call(_2,Sl);
            if ( info.toboolean() ) {
               print$1.call(_info_2_.concat(tostring$2.call(info.get(short_sr)).concat(_$3.concat(tostring$2.call(info.get(currentl)).buffer()))).value());
            }
            return NONE;
         }
      };
      final LuaValue tryfunc = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue hook$1 = $arg.arg1();
            final LuaValue mask = $arg.arg(2);
            final LuaValue func$1 = $arg.arg(3);
            final LuaValue arg$1 = $arg.arg(4);
            final LuaValue[] x = {NIL};
            final LuaValue[] f$3 = {NIL};
            final LuaValue[] h$2 = {NIL};
            final LuaValue[] m = {NIL};
            pcall$1.call(new ZeroArgFunction(env) {
               public LuaValue call() {
                  env.get(debug).get(sethook).call(hook$1,mask);
                  x[0] = func$1.call(arg$1);
                  final Varargs v$3 = env.get(debug).get(gethook).invoke();
                  f$3[0] = v$3.arg1();
                  h$2[0] = v$3.arg(2);
                  m[0] = v$3.arg(3);
                  return NONE;
               }
            });
            env.get(debug).get(sethook).call();
            return varargsOf(new LuaValue[] {x[0],f$3[0],h$2[0],},m[0]);
         }
      };
      final LuaValue tryhooks = new OneArgFunction(env) {
         public LuaValue call(LuaValue mask) {
            final Varargs t$10 = pcall$1.invoke(varargsOf(new LuaValue[] {tryfunc,hook,mask,f$2[0],},_333));
            final LuaValue s1$2 = t$10.arg1();
            final LuaValue a1 = t$10.arg(2);
            final LuaValue b1 = t$10.arg(3);
            final LuaValue c1 = t$10.arg(4);
            final LuaValue d1 = t$10.arg(5);
            print$1.call(hook___.concat(mask.concat(____.concat(result_.concat(tostring$2.call(s1$2).concat(_$3.concat(tostring$2.call(a1).concat(_$3.concat(env.get(type$1).call(b1).concat(_$3.concat(env.get(type$1).call(c1).concat(_$3.concat(tostring$2.call(b1.eq(f$2[0])).concat(_$3.concat(tostring$2.call(c1.eq(hook)).concat(_$3.concat(tostring$2.call(d1).concat(_$2.buffer()))))))))))))))))).value());
            return NONE;
         }
      };
      return NONE;
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue tostring$1 = valueOf("tostring");
   static final LuaValue _G = valueOf("_G");
   static final LuaValue pcall = valueOf("pcall");
   static final LuaValue ipairs = valueOf("ipairs");
   static final LuaValue isnumber$1 = valueOf("isnumber");
   static final LuaValue has_debu = valueOf("has debug");
   static final LuaValue debug = valueOf("debug");
   static final LuaValue error$1 = valueOf("error");
   static final LuaValue no_debug = valueOf("no debug");
   static final LuaValue ______de = valueOf("----- debug.getfenv, debug.setfenv");
   static final LuaValue f_ = valueOf("f:");
   static final LuaValue _ = valueOf("|");
   static final LuaValue b = valueOf("b");
   static final LuaValue getfenv$1 = valueOf("getfenv");
   static final LuaValue type$1 = valueOf("type");
   static final LuaValue G = valueOf("G");
   static final LuaValue abc = valueOf("abc");
   static final LuaValue setfenv$1 = valueOf("setfenv");
   static final LuaValue def = valueOf("def");
   static final LuaValue ______de$1 = valueOf("----- debug.getlocal, debug.setlocal");
   static final LuaValue h_ = valueOf("h-");
   static final LuaValue _$1 = valueOf("-");
   static final LuaValue getlocal = valueOf("getlocal");
   static final LuaValue setlocal = valueOf("setlocal");
   static final LuaValue ____ = valueOf(" -> ");
   static final LuaValue _$2 = valueOf(" ");
   static final LuaValue get_ = valueOf("get=");
   static final LuaValue _$3 = valueOf(",");
   static final LuaValue set_ = valueOf("set=");
   static final LuaValue table = valueOf("table");
   static final LuaValue concat$1 = valueOf("concat");
   static final LuaValue _g_local = valueOf("\tg locals=");
   static final LuaValue _7 = valueOf(7);
   static final LuaValue _8 = valueOf(8);
   static final LuaValue _9 = valueOf(9);
   static final LuaValue _tbl__ = valueOf(" tbl={");
   static final LuaValue _$4 = valueOf("}");
   static final LuaValue _f_local = valueOf("\tf locals=");
   static final LuaValue _4 = valueOf(4);
   static final LuaValue _5 = valueOf(5);
   static final LuaValue _6 = valueOf(6);
   static final LuaValue _3 = valueOf(3);
   static final LuaValue _2 = valueOf(2);
   static final LuaValue _$5 = valueOf("#");
   static final LuaValue ______de$2 = valueOf("----- debug.getupvalue, debug.setupvalue");
   static final LuaValue _101 = valueOf(101);
   static final LuaValue _102 = valueOf(102);
   static final LuaValue _103 = valueOf(103);
   static final LuaValue _104 = valueOf(104);
   static final LuaValue _105 = valueOf(105);
   static final LuaValue _106 = valueOf(106);
   static final LuaValue _107 = valueOf(107);
   static final LuaValue _108 = valueOf(108);
   static final LuaValue _109 = valueOf(109);
   static final LuaValue h$1 = valueOf("h");
   static final LuaValue f$1 = valueOf("f");
   static final LuaValue g$1 = valueOf("g");
   static final LuaValue _10 = valueOf(10);
   static final LuaValue getupval = valueOf("getupvalue");
   static final LuaValue setupval = valueOf("setupvalue");
   static final LuaValue tbl_ = valueOf("tbl=");
   static final LuaValue ______de$3 = valueOf("----- debug.setmetatable, debug.getmetatable");
   static final LuaValue a = valueOf("a");
   static final LuaValue bbb = valueOf("bbb");
   static final LuaValue __index = valueOf("__index");
   static final LuaValue ccc = valueOf("ccc");
   static final LuaValue a_a_ = valueOf("a.a=");
   static final LuaValue _a_b_ = valueOf(" a.b=");
   static final LuaValue _b_a_ = valueOf(" b.a=");
   static final LuaValue _b_b_ = valueOf(" b.b=");
   static final LuaValue getmetat = valueOf("getmetatable");
   static final LuaValue setmetat = valueOf("setmetatable");
   static final LuaValue s1_error = valueOf("s1 error");
   static final LuaValue s2_error = valueOf("s2 error");
   static final LuaValue s3_error = valueOf("s3 error");
   static final LuaValue s4_error = valueOf("s4 error");
   static final LuaValue s5_error = valueOf("s5 error");
   static final LuaValue s6_error = valueOf("s6 error");
   static final LuaValue ______de$4 = valueOf("----- debug.getinfo");
   static final LuaValue _$6 = valueOf("{");
   static final LuaValue function = valueOf("function");
   static final LuaValue ____$1 = valueOf("    ");
   static final LuaValue __ = valueOf(": ");
   static final LuaValue source = valueOf("source");
   static final LuaValue short_sr = valueOf("short_src");
   static final LuaValue what = valueOf("what");
   static final LuaValue currentl = valueOf("currentline");
   static final LuaValue linedefi = valueOf("linedefined");
   static final LuaValue lastline = valueOf("lastlinedefined");
   static final LuaValue nups = valueOf("nups");
   static final LuaValue func = valueOf("func");
   static final LuaValue activeli = valueOf("activelines");
   static final LuaValue ___ = valueOf("---");
   static final LuaValue debug_ge = valueOf("debug.getinfo(1)");
   static final LuaValue getinfo = valueOf("getinfo");
   static final LuaValue debug_ge$1 = valueOf("debug.getinfo(1,\"\")");
   static final LuaValue _$7 = valueOf("");
   static final LuaValue debug_ge$2 = valueOf("debug.getinfo(1,\"l\")");
   static final LuaValue l = valueOf("l");
   static final LuaValue debug_ge$3 = valueOf("debug.getinfo(1,\"fL\")");
   static final LuaValue fL = valueOf("fL");
   static final LuaValue debug_ge$4 = valueOf("debug.getinfo(2)");
   static final LuaValue debug_ge$5 = valueOf("debug.getinfo(2,\"l\")");
   static final LuaValue debug_ge$6 = valueOf("debug.getinfo(2,\"fL\")");
   static final LuaValue debug_ge$7 = valueOf("debug.getinfo(10,\"\")");
   static final LuaValue debug_ge$8 = valueOf("debug.getinfo(-10,\"\")");
   static final LuaValue test = valueOf("test");
   static final LuaValue e_f_g = valueOf("e,f,g");
   static final LuaValue debug_ge$9 = valueOf("debug.getinfo(f)");
   static final LuaValue debug_ge$10 = valueOf("debug.getinfo(f,\"");
   static final LuaValue nSlufL = valueOf("nSlufL");
   static final LuaValue __$1 = valueOf("\")");
   static final LuaValue sub$1 = valueOf("sub");
   static final LuaValue debug_ge$11 = valueOf("debug.getinfo(g)");
   static final LuaValue debug_ge$12 = valueOf("debug.getinfo(test)");
   static final LuaValue ______de$5 = valueOf("----- debug.sethook, debug.gethook");
   static final LuaValue math = valueOf("math");
   static final LuaValue min = valueOf("min");
   static final LuaValue _______i = valueOf("   ... in hook");
   static final LuaValue Sl = valueOf("Sl");
   static final LuaValue _info_2_ = valueOf(" info[2]=");
   static final LuaValue sethook = valueOf("sethook");
   static final LuaValue gethook = valueOf("gethook");
   static final LuaValue _333 = valueOf(333);
   static final LuaValue hook___ = valueOf("hook = ");
   static final LuaValue result_ = valueOf("result=");
}