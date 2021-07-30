import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _tailcalls extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue ts = env.get(tostring$1);
      final LuaValue id = LuaValue.tableOf();
      final LuaValue[] nid = {ZERO};
      final LuaValue types = LuaValue.tableOf(new LuaValue[]{table,tbl,thread,thr,userdata,uda,function,func,});
      env.set(tostring$1,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue x = $arg.arg1();
            LuaValue $b;
            if ( ((!x.toboolean())||(!types.get(env.get(type$1).call(x)).toboolean())) ) {
               return new TailcallVarargs(ts,x);
            }
            if ( (!id.get(x).toboolean()) ) {
               nid[0] = valueOf(nid[0].checkdouble()+1);
               id.set(x,types.get(env.get(type$1).call(x)).concat(_.concat(nid[0].buffer())).value());
            }
            return id.get(x);
         }
      });
      env.set(a,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(pcall),new ZeroArgFunction(env) {
               public LuaValue call() {
                  return NONE;
               }
            });
         }
      });
      env.set(b,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(pcall),new ZeroArgFunction(env) {
               public LuaValue call() {
                  env.get(print).call(b);
                  return NONE;
               }
            });
         }
      });
      env.set(c,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(pcall),new ZeroArgFunction(env) {
               public LuaValue call() {
                  return c;
               }
            });
         }
      });
      env.get(print).invoke(env.get(pcall).invoke(env.get(a)));
      env.get(print).invoke(env.get(pcall).invoke(env.get(b)));
      env.get(print).invoke(env.get(pcall).invoke(env.get(c)));
      final LuaValue sum = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            LuaValue s = ZERO;
            LuaValue f,s$1,var;
            Varargs v;
            final Varargs v$1 = env.get(ipairs).invoke(LuaValue.listOf(new LuaValue[]{}, $arg));
            f = v$1.arg1();
            s$1 = v$1.arg(2);
            var = v$1.arg(3);
            while (true) {
               v = f.invoke(varargsOf(s$1,var));
               if ((var=v.arg1()).isnil()) break;
               final LuaValue i = var;
               final LuaValue v$2 = v.arg(2);
               s = valueOf(s.checkdouble()+v$2.checkdouble());
            }
            return s;
         }
      };
      final LuaValue[] f1 = new LuaValue[1];
      f1[0] = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue n = $arg.arg1();
            final LuaValue a$1 = $arg.arg(2);
            final LuaValue b$1 = $arg.arg(3);
            final LuaValue c$1 = $arg.arg(4);
            LuaValue $b;
            final LuaValue a$2 = (($b=a$1).toboolean()?$b:ZERO);
            final LuaValue b$2 = (($b=b$1).toboolean()?$b:ZERO);
            final LuaValue c$2 = (($b=c$1).toboolean()?$b:ZERO);
            if ( n.lteq_b(ZERO) ) {
               return varargsOf(a$2,valueOf(a$2.checkdouble()+b$2.checkdouble()),valueOf((a$2.checkdouble()+b$2.checkdouble())+c$2.checkdouble()));
            }
            return new TailcallVarargs(f1[0],varargsOf(new LuaValue[] {valueOf(n.checkdouble()-1),a$2,valueOf(a$2.checkdouble()+b$2.checkdouble()),},valueOf((a$2.checkdouble()+b$2.checkdouble())+c$2.checkdouble())));
         }
      };
      final LuaValue[] f2 = new LuaValue[1];
      f2[0] = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue n = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            if ( n.lteq_b(ZERO) ) {
               env.get(print).invoke(varargsOf(___f2__n,$arg));
               return new TailcallVarargs(sum,$arg);
            }
            env.get(print).invoke(varargsOf(new LuaValue[] {___f2__n$1,valueOf(n.checkdouble()-1),n,},$arg));
            return new TailcallVarargs(f2[0],varargsOf(valueOf(n.checkdouble()-1),n,$arg));
         }
      };
      final LuaValue[] f3 = new LuaValue[1];
      f3[0] = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue n = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            if ( n.lteq_b(ZERO) ) {
               return new TailcallVarargs(sum,$arg);
            }
            env.get(print).invoke(varargsOf(new LuaValue[] {____f3_n,f3[0],valueOf(n.checkdouble()-1),n,},$arg));
            return new TailcallVarargs(env.get(pcall),varargsOf(new LuaValue[] {f3[0],valueOf(n.checkdouble()-1),n,},$arg));
         }
      };
      final LuaValue all = new OneArgFunction(env) {
         public LuaValue call(LuaValue f) {
            for ( double n$0=ZERO.checkdouble(), n$limit=_3.checkdouble(); n$0<=n$limit; ++n$0 ) {
               final LuaValue n = valueOf(n$0);
               env.set(t,LuaValue.tableOf());
               for ( double m$0=ONE.checkdouble(), m$limit=_5.checkdouble(); m$0<=m$limit; ++m$0 ) {
                  final LuaValue m = valueOf(m$0);
                  env.get(print).invoke(varargsOf(new LuaValue[] {__f__n__,f,n,},env.get(unpack).invoke(env.get(t))));
                  env.get(print).invoke(env.get(pcall).invoke(varargsOf(f,n,env.get(unpack).invoke(env.get(t)))));
                  env.get(t).set(m,m);
               }
            }
            return NONE;
         }
      };
      all.call(f1[0]);
      all.call(f2[0]);
      all.call(f3[0]);
      final LuaValue f = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue x = $arg.arg1();
            return new TailcallVarargs(env.get(math).get(abs),x);
         }
      };
      final LuaValue factorial = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue i = $arg.arg1();
            final LuaValue[] helper = new LuaValue[1];
            helper[0] = new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue product = $arg.arg1();
                  final LuaValue n = $arg.arg(2);
                  if ( n.lteq_b(ZERO) ) {
                     return product;
                  } else {
                     return new TailcallVarargs(helper[0],varargsOf(valueOf(n.checkdouble()*product.checkdouble()),valueOf(n.checkdouble()-1)));
                  }
               }
            };
            return new TailcallVarargs(helper[0],varargsOf(ONE,i));
         }
      };
      final LuaValue result1 = factorial.call(_5);
      env.get(print).call(result1);
      env.get(print).invoke(factorial.invoke(_5));
      final LuaValue result2 = f.call(_1234.neg());
      env.get(print).call(result2);
      final LuaValue fib_bad = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue n = $arg.arg1();
            final LuaValue[] helper = new LuaValue[1];
            helper[0] = new ThreeArgFunction(env) {
               public LuaValue call(LuaValue i,LuaValue a$1,LuaValue b$1) {
                  if ( i.gteq_b(n) ) {
                     return a$1;
                  } else {
                     final LuaValue result = helper[0].call(valueOf(i.checkdouble()+1),b$1,valueOf(a$1.checkdouble()+b$1.checkdouble()));
                     return result;
                  }
               }
            };
            return new TailcallVarargs(helper[0],varargsOf(ONE,ONE,ONE));
         }
      };
      final LuaValue fib_good = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue n = $arg.arg1();
            final LuaValue[] helper = new LuaValue[1];
            helper[0] = new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue i = $arg.arg1();
                  final LuaValue a$1 = $arg.arg(2);
                  final LuaValue b$1 = $arg.arg(3);
                  if ( i.gteq_b(n) ) {
                     return a$1;
                  } else {
                     return new TailcallVarargs(helper[0],varargsOf(valueOf(i.checkdouble()+1),b$1,valueOf(a$1.checkdouble()+b$1.checkdouble())));
                  }
               }
            };
            return new TailcallVarargs(helper[0],varargsOf(ONE,ONE,ONE));
         }
      };
      final LuaValue aliases = LuaValue.tableOf(new LuaValue[]{_1__INF,inf,_1__INF$1,_inf,_1__IND,nan,_1__IND$1,nan,});
      final LuaValue p = new TwoArgFunction(env) {
         public LuaValue call(LuaValue s,LuaValue e) {
            LuaValue $b;
            env.get(print).call(s,(($b=(!($b=e).toboolean()?$b:aliases.get(env.get(tostring$1).call(e)))).toboolean()?$b:e));
            return NONE;
         }
      };
      p.invoke(env.get(pcall).invoke(varargsOf(fib_bad,_30)));
      p.invoke(env.get(pcall).invoke(varargsOf(fib_good,_30)));
      p.invoke(env.get(pcall).invoke(varargsOf(fib_good,_25000)));
      final LuaValue[] fib_all = new LuaValue[1];
      fib_all[0] = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue n = $arg.arg1();
            LuaValue i = $arg.arg(2);
            LuaValue a$1 = $arg.arg(3);
            LuaValue b$1 = $arg.arg(4);
            LuaValue $b;
            i = (($b=i).toboolean()?$b:ONE);
            a$1 = (($b=a$1).toboolean()?$b:ONE);
            b$1 = (($b=b$1).toboolean()?$b:ONE);
            if ( i.gteq_b(n) ) {
               return NONE;
            } else {
               return varargsOf(a$1,fib_all[0].invoke(varargsOf(new LuaValue[] {n,valueOf(i.checkdouble()+1),b$1,},valueOf(a$1.checkdouble()+b$1.checkdouble()))));
            }
         }
      };
      env.get(print).invoke(fib_all[0].invoke(_10));
      return NONE;
   }
   static final LuaValue tostring$1 = valueOf("tostring");
   static final LuaValue table = valueOf("table");
   static final LuaValue tbl = valueOf("tbl");
   static final LuaValue thread = valueOf("thread");
   static final LuaValue thr = valueOf("thr");
   static final LuaValue userdata = valueOf("userdata");
   static final LuaValue uda = valueOf("uda");
   static final LuaValue function = valueOf("function");
   static final LuaValue func = valueOf("func");
   static final LuaValue type$1 = valueOf("type");
   static final LuaValue _ = valueOf(".");
   static final LuaValue pcall = valueOf("pcall");
   static final LuaValue a = valueOf("a");
   static final LuaValue print = valueOf("print");
   static final LuaValue b = valueOf("b");
   static final LuaValue c = valueOf("c");
   static final LuaValue ipairs = valueOf("ipairs");
   static final LuaValue ___f2__n = valueOf(" --f2, n<=0, returning sum(...)");
   static final LuaValue ___f2__n$1 = valueOf(" --f2, n>0, returning f2(n-1,n,...)");
   static final LuaValue ____f3_n = valueOf("    f3,n-1,n,...");
   static final LuaValue _3 = valueOf(3);
   static final LuaValue t = valueOf("t");
   static final LuaValue _5 = valueOf(5);
   static final LuaValue __f__n__ = valueOf("--f, n, unpack(t)");
   static final LuaValue unpack = valueOf("unpack");
   static final LuaValue math = valueOf("math");
   static final LuaValue abs = valueOf("abs");
   static final LuaValue _1234 = valueOf(1234);
   static final LuaValue _1__INF = valueOf("1.#INF");
   static final LuaValue inf = valueOf("inf");
   static final LuaValue _1__INF$1 = valueOf("-1.#INF");
   static final LuaValue _inf = valueOf("-inf");
   static final LuaValue _1__IND = valueOf("1.#IND");
   static final LuaValue nan = valueOf("nan");
   static final LuaValue _1__IND$1 = valueOf("-1.#IND");
   static final LuaValue _30 = valueOf(30);
   static final LuaValue _25000 = valueOf(25000);
   static final LuaValue _10 = valueOf(10);
}