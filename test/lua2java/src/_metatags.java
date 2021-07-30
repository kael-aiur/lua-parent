import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _metatags extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue anumstr = env.get(tostring$1).call(_111);
      final LuaValue bnumstr = env.get(tostring$1).call(_23_45);
      final LuaValue afunction = new ZeroArgFunction(env) {
         public LuaValue call() {
            return NONE;
         }
      };
      final LuaValue bfunction = new ZeroArgFunction(env) {
         public LuaValue call() {
            return NONE;
         }
      };
      final LuaValue athread = env.get(coroutin).get(create).call(afunction);
      final LuaValue bthead = env.get(coroutin).get(create).call(bfunction);
      final LuaValue atable = LuaValue.tableOf();
      final LuaValue btable = LuaValue.tableOf();
      LuaValue values = LuaValue.listOf(new LuaValue[]{_111,FALSE,afunction,athread,atable,});
      LuaValue groups = NIL;
      final LuaValue ts = env.get(tostring$1);
      final LuaValue tb = LuaValue.tableOf();
      final LuaValue[] count = {ZERO};
      env.set(tostring$1,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue o = $arg.arg1();
            LuaValue $b;
            final LuaValue t = env.get(type$1).call(o);
            if ( ((t.neq_b(thread)&&t.neq_b(function))&&t.neq_b(table)) ) {
               return new TailcallVarargs(ts,o);
            }
            if ( (!tb.get(o).toboolean()) ) {
               count[0] = valueOf(count[0].checkdouble()+1);
               tb.set(o,t.concat(_.concat(count[0].buffer())).value());
            }
            return tb.get(o);
         }
      });
      final LuaValue buildop = new OneArgFunction(env) {
         public LuaValue call(LuaValue name$1$0) {
            final LuaValue name$1 = name$1$0;
            return new TwoArgFunction(env) {
               public LuaValue call(LuaValue a,LuaValue b) {
                  env.get(print).call(mt___.concat(name$1.concat(__.buffer())).value(),a,b);
                  return __$1.concat(name$1.concat(_result.buffer())).value();
               }
            };
         }
      };
      final LuaValue buildop3 = new OneArgFunction(env) {
         public LuaValue call(LuaValue name$1$0) {
            final LuaValue name$1 = name$1$0;
            return new ThreeArgFunction(env) {
               public LuaValue call(LuaValue a,LuaValue b,LuaValue c) {
                  env.get(print).invoke(varargsOf(new LuaValue[] {mt___.concat(name$1.concat(__.buffer())).value(),a,b,},c));
                  return __$1.concat(name$1.concat(_result.buffer())).value();
               }
            };
         }
      };
      final LuaValue buildop1 = new OneArgFunction(env) {
         public LuaValue call(LuaValue name$1$0) {
            final LuaValue name$1 = name$1$0;
            return new OneArgFunction(env) {
               public LuaValue call(LuaValue a) {
                  env.get(print).call(mt___.concat(name$1.concat(__.buffer())).value(),a);
                  return __$1.concat(name$1.concat(_result.buffer())).value();
               }
            };
         }
      };
      final LuaValue mt = LuaValue.tableOf(new LuaValue[]{__call,buildop.call(call$1),__add,buildop.call(add$1),__sub,buildop.call(sub$1),__mul,buildop.call(mul$1),__div,buildop.call(div$1),__pow,buildop.call(pow$1),__mod,buildop.call(mod$1),__unm,buildop1.call(unm),__len,buildop1.call(len$1),__lt,buildop.call(lt$1),__le,buildop.call(le),__index,buildop.call(index),__newind,buildop3.call(newindex),__concat,buildop.call(concat$1),});
      env.set(ecall,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue pattern = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            LuaValue $b;
            final Varargs t = env.get(pcall).invoke($arg);
            final LuaValue s = t.arg1();
            LuaValue e = t.arg(2);
            if ( (!s.toboolean()) ) {
               e = (($b=env.get(string).get(match).call(e,pattern)).toboolean()?$b:e);
            }
            return varargsOf(s,e);
         }
      });
      env.get(print).call(_______e);
      final LuaValue eqmt = LuaValue.tableOf(new LuaValue[]{__eq,buildop.call(eq$1),});
      groups = LuaValue.listOf(new LuaValue[]{LuaValue.listOf(new LuaValue[]{NIL,NIL,}),LuaValue.listOf(new LuaValue[]{TRUE,FALSE,}),LuaValue.listOf(new LuaValue[]{_123,_456,}),LuaValue.listOf(new LuaValue[]{_11,_5_5,}),LuaValue.listOf(new LuaValue[]{afunction,bfunction,}),LuaValue.listOf(new LuaValue[]{athread,env.get(bthread),}),LuaValue.listOf(new LuaValue[]{abc,def,}),LuaValue.listOf(new LuaValue[]{_111,anumstr,}),});
      for ( double i$0=ONE.checkdouble(), i$limit=groups.len().checkdouble(); i$0<=i$limit; ++i$0 ) {
         final LuaValue i = valueOf(i$0);
         final LuaValue a = groups.get(i).get(ONE);
         final LuaValue b = groups.get(i).get(_2);
         final LuaValue amt = env.get(debug).get(getmetat).call(a);
         final LuaValue bmt = env.get(debug).get(getmetat).call(b);
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a),env.get(type$1).call(b),before,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a.eq(b);
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a),env.get(type$1).call(b),before,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a.neq(b);
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a,eqmt)));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(b,eqmt)));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a),env.get(type$1).call(b),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a.eq(b);
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a),env.get(type$1).call(b),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a.neq(b);
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a,amt)));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(b,bmt)));
      }
      env.get(print).call(_______e$1);
      groups = LuaValue.listOf(new LuaValue[]{LuaValue.listOf(new LuaValue[]{atable,btable,}),});
      for ( double i$1$0=ONE.checkdouble(), i$1$limit=groups.len().checkdouble(); i$1$0<=i$1$limit; ++i$1$0 ) {
         final LuaValue i$1 = valueOf(i$1$0);
         final LuaValue a$1 = groups.get(i$1).get(ONE);
         final LuaValue b$1 = groups.get(i$1).get(_2);
         final LuaValue amt$1 = env.get(debug).get(getmetat).call(a$1);
         final LuaValue bmt$1 = env.get(debug).get(getmetat).call(b$1);
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$1),env.get(type$1).call(b$1),before,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$1.eq(b$1);
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$1),env.get(type$1).call(b$1),before,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$1.neq(b$1);
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$1,eqmt)));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(b$1,eqmt)));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$1),env.get(type$1).call(b$1),after_a,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$1.eq(b$1);
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$1),env.get(type$1).call(b$1),after_a,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$1.neq(b$1);
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$1,amt$1)));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(b$1,bmt$1)));
      }
      env.get(print).invoke(varargsOf(nilmt,env.get(debug).get(getmetat).invoke(NIL)));
      env.get(print).invoke(varargsOf(boolmt,env.get(debug).get(getmetat).invoke(TRUE)));
      env.get(print).invoke(varargsOf(number,env.get(debug).get(getmetat).invoke(ONE)));
      env.get(print).invoke(varargsOf(function,env.get(debug).get(getmetat).invoke(afunction)));
      env.get(print).invoke(varargsOf(thread,env.get(debug).get(getmetat).invoke(athread)));
      env.get(print).call(_______c);
      for ( double i$2$0=ONE.checkdouble(), i$2$limit=values.len().checkdouble(); i$2$0<=i$2$limit; ++i$2$0 ) {
         final LuaValue i$2 = valueOf(i$2$0);
         final LuaValue a$2 = values.get(i$2);
         final LuaValue amt$2 = env.get(debug).get(getmetat).call(a$2);
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$2),before,env.get(ecall).invoke(varargsOf(attempt_,new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return new TailcallVarargs(a$2,varargsOf(a$3,b$2));
            }
         }))));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$2,mt)));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$2),after,env.get(pcall).invoke(new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return new TailcallVarargs(a$2,NONE);
            }
         })));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$2),after,env.get(pcall).invoke(new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return new TailcallVarargs(a$2,a$3);
            }
         })));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$2),after,env.get(pcall).invoke(new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return new TailcallVarargs(a$2,varargsOf(a$3,b$2));
            }
         })));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$2),after,env.get(pcall).invoke(new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return new TailcallVarargs(a$2,varargsOf(a$3,b$2,c));
            }
         })));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$2),after,env.get(pcall).invoke(new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return new TailcallVarargs(a$2,varargsOf(new LuaValue[] {a$3,b$2,c,},d));
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$2,amt$2)));
      }
      env.get(print).call(_______a);
      final LuaValue groups$1 = LuaValue.listOf(new LuaValue[]{LuaValue.listOf(new LuaValue[]{FALSE,FALSE,}),LuaValue.listOf(new LuaValue[]{FALSE,athread,}),LuaValue.listOf(new LuaValue[]{FALSE,afunction,}),LuaValue.listOf(new LuaValue[]{FALSE,abc,}),LuaValue.listOf(new LuaValue[]{FALSE,atable,}),});
      for ( double i$3$0=ONE.checkdouble(), i$3$limit=groups$1.len().checkdouble(); i$3$0<=i$3$limit; ++i$3$0 ) {
         final LuaValue i$3 = valueOf(i$3$0);
         final LuaValue a$4 = groups$1.get(i$3).get(ONE);
         final LuaValue b$3 = groups$1.get(i$3).get(_2);
         final LuaValue amt$3 = env.get(debug).get(getmetat).call(a$4);
         final LuaValue bmt$2 = env.get(debug).get(getmetat).call(b$3);
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),before,},env.get(ecall).invoke(varargsOf(attempt_$1,new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(a$4.checkdouble()+b$3.checkdouble());
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),before,},env.get(ecall).invoke(varargsOf(attempt_$1,new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(b$3.checkdouble()+a$4.checkdouble());
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),before,},env.get(ecall).invoke(varargsOf(attempt_$1,new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(a$4.checkdouble()-b$3.checkdouble());
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),before,},env.get(ecall).invoke(varargsOf(attempt_$1,new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(b$3.checkdouble()-a$4.checkdouble());
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),before,},env.get(ecall).invoke(varargsOf(attempt_$1,new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(a$4.checkdouble()*b$3.checkdouble());
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),before,},env.get(ecall).invoke(varargsOf(attempt_$1,new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(b$3.checkdouble()*a$4.checkdouble());
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),before,},env.get(ecall).invoke(varargsOf(attempt_$1,new ZeroArgFunction(env) {
            public LuaValue call() {
               return MathLib.dpow(a$4.checkdouble(),b$3.checkdouble());
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),before,},env.get(ecall).invoke(varargsOf(attempt_$1,new ZeroArgFunction(env) {
            public LuaValue call() {
               return MathLib.dpow(b$3.checkdouble(),a$4.checkdouble());
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),before,},env.get(ecall).invoke(varargsOf(attempt_$1,new ZeroArgFunction(env) {
            public LuaValue call() {
               return LuaDouble.dmod(a$4.checkdouble(),b$3.checkdouble());
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),before,},env.get(ecall).invoke(varargsOf(attempt_$1,new ZeroArgFunction(env) {
            public LuaValue call() {
               return LuaDouble.dmod(b$3.checkdouble(),a$4.checkdouble());
            }
         }))));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$4,mt)));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(a$4.checkdouble()+b$3.checkdouble());
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(b$3.checkdouble()+a$4.checkdouble());
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(a$4.checkdouble()-b$3.checkdouble());
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(b$3.checkdouble()-a$4.checkdouble());
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(a$4.checkdouble()*b$3.checkdouble());
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return valueOf(b$3.checkdouble()*a$4.checkdouble());
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return MathLib.dpow(a$4.checkdouble(),b$3.checkdouble());
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return MathLib.dpow(b$3.checkdouble(),a$4.checkdouble());
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return LuaDouble.dmod(a$4.checkdouble(),b$3.checkdouble());
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$4),env.get(type$1).call(b$3),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return LuaDouble.dmod(b$3.checkdouble(),a$4.checkdouble());
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$4,amt$3)));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(b$3,bmt$2)));
      }
      env.get(print).call(_______l);
      values = LuaValue.listOf(new LuaValue[]{FALSE,afunction,athread,_111,});
      for ( double i$4$0=ONE.checkdouble(), i$4$limit=values.len().checkdouble(); i$4$0<=i$4$limit; ++i$4$0 ) {
         final LuaValue i$4 = valueOf(i$4$0);
         final LuaValue a$5 = values.get(i$4);
         final LuaValue amt$4 = env.get(debug).get(getmetat).call(a$5);
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$5),before,env.get(ecall).invoke(varargsOf(attempt_$2,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$5.len();
            }
         }))));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$5,mt)));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$5),after,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$5.len();
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$5,amt$4)));
      }
      env.get(print).call(_______n);
      values = LuaValue.listOf(new LuaValue[]{FALSE,afunction,athread,abcd,atable,_111,});
      for ( double i$5$0=ONE.checkdouble(), i$5$limit=values.len().checkdouble(); i$5$0<=i$5$limit; ++i$5$0 ) {
         final LuaValue i$5 = valueOf(i$5$0);
         final LuaValue a$6 = values.get(i$5);
         final LuaValue amt$5 = env.get(debug).get(getmetat).call(a$6);
         env.get(print).invoke(varargsOf(env.get(type$1).call(env.get(v)),before,env.get(ecall).invoke(varargsOf(attempt_$3,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$6.neg();
            }
         }))));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$6,mt)));
         env.get(print).invoke(varargsOf(env.get(type$1).call(env.get(v)),after,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$6.neg();
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$6,amt$5)));
      }
      env.get(print).call(_______l$1);
      final LuaValue bfunction$1 = new ZeroArgFunction(env) {
         public LuaValue call() {
            return NONE;
         }
      };
      final LuaValue bthread$1 = env.get(coroutin).get(create).call(bfunction$1);
      final LuaValue btable$1 = LuaValue.tableOf();
      LuaValue groups$2 = NIL;
      groups$2 = LuaValue.listOf(new LuaValue[]{LuaValue.listOf(new LuaValue[]{TRUE,TRUE,}),LuaValue.listOf(new LuaValue[]{TRUE,FALSE,}),LuaValue.listOf(new LuaValue[]{afunction,bfunction$1,}),LuaValue.listOf(new LuaValue[]{athread,bthread$1,}),LuaValue.listOf(new LuaValue[]{atable,atable,}),LuaValue.listOf(new LuaValue[]{atable,btable$1,}),});
      for ( double i$6$0=ONE.checkdouble(), i$6$limit=groups$2.len().checkdouble(); i$6$0<=i$6$limit; ++i$6$0 ) {
         final LuaValue i$6 = valueOf(i$6$0);
         final LuaValue a$7 = groups$2.get(i$6).get(ONE);
         final LuaValue b$4 = groups$2.get(i$6).get(_2);
         final LuaValue amt$6 = env.get(debug).get(getmetat).call(a$7);
         final LuaValue bmt$3 = env.get(debug).get(getmetat).call(b$4);
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$7),env.get(type$1).call(b$4),before,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$7.lt(b$4);
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$7),env.get(type$1).call(b$4),before,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$7.lteq(b$4);
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$7),env.get(type$1).call(b$4),before,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$7.gt(b$4);
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$7),env.get(type$1).call(b$4),before,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$7.gteq(b$4);
            }
         }))));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$7,mt)));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(b$4,mt)));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$7),env.get(type$1).call(b$4),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$7.lt(b$4);
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$7),env.get(type$1).call(b$4),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$7.lteq(b$4);
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$7),env.get(type$1).call(b$4),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$7.gt(b$4);
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$7),env.get(type$1).call(b$4),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$7.gteq(b$4);
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$7,amt$6)));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(b$4,bmt$3)));
      }
      env.get(print).call(_______l$2);
      groups$2 = LuaValue.listOf(new LuaValue[]{LuaValue.listOf(new LuaValue[]{FALSE,athread,}),});
      for ( double i$7$0=ONE.checkdouble(), i$7$limit=groups$2.len().checkdouble(); i$7$0<=i$7$limit; ++i$7$0 ) {
         final LuaValue i$7 = valueOf(i$7$0);
         final LuaValue a$8 = groups$2.get(i$7).get(ONE);
         final LuaValue b$5 = groups$2.get(i$7).get(_2);
         final LuaValue amt$7 = env.get(debug).get(getmetat).call(a$8);
         final LuaValue bmt$4 = env.get(debug).get(getmetat).call(b$5);
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$8),env.get(type$1).call(b$5),before,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$8.lt(b$5);
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$8),env.get(type$1).call(b$5),before,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$8.lteq(b$5);
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$8),env.get(type$1).call(b$5),before,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$8.gt(b$5);
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$8),env.get(type$1).call(b$5),before,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$8.gteq(b$5);
            }
         }))));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$8,mt)));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(b$5,mt)));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$8),env.get(type$1).call(b$5),after_a,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$8.lt(b$5);
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$8),env.get(type$1).call(b$5),after_a,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$8.lteq(b$5);
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$8),env.get(type$1).call(b$5),after_a,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$8.gt(b$5);
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$8),env.get(type$1).call(b$5),after_a,},env.get(ecall).invoke(varargsOf(attempt_$4,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$8.gteq(b$5);
            }
         }))));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$8,amt$7)));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(b$5,bmt$4)));
      }
      env.get(print).call(_______t);
      values = LuaValue.listOf(new LuaValue[]{FALSE,afunction,athread,atable,abc,});
      final LuaValue strmt = LuaValue.tableOf(new LuaValue[]{__tostri,new OneArgFunction(env) {
         public LuaValue call(LuaValue a$9) {
            return mt___tos.concat(env.get(type$1).call(a$9).concat(_$1.buffer())).value();
         }
      },});
      for ( double i$8$0=ONE.checkdouble(), i$8$limit=values.len().checkdouble(); i$8$0<=i$8$limit; ++i$8$0 ) {
         final LuaValue i$8 = valueOf(i$8$0);
         final LuaValue a$9 = values.get(i$8);
         final LuaValue amt$8 = env.get(debug).get(getmetat).call(a$9);
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$9,strmt)));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$9),after,env.get(pcall).invoke(new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return new TailcallVarargs(ts,a$9);
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$9,amt$8)));
      }
      env.get(print).call(_______i);
      values = LuaValue.listOf(new LuaValue[]{FALSE,_111,afunction,athread,});
      for ( double i$9$0=ONE.checkdouble(), i$9$limit=values.len().checkdouble(); i$9$0<=i$9$limit; ++i$9$0 ) {
         final LuaValue i$9 = valueOf(i$9$0);
         final LuaValue a$10 = values.get(i$9);
         final LuaValue amt$9 = env.get(debug).get(getmetat).call(a$10);
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$10),before,env.get(ecall).invoke(varargsOf(attempt_$5,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$10.get(foo);
            }
         }))));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$10),before,env.get(ecall).invoke(varargsOf(attempt_$5,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$10.get(_123);
            }
         }))));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$10),before,env.get(ecall).invoke(varargsOf(index,new ZeroArgFunction(env) {
            public LuaValue call() {
               a$10.set(foo,bar);
               return NONE;
            }
         }))));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$10),before,env.get(ecall).invoke(varargsOf(index,new ZeroArgFunction(env) {
            public LuaValue call() {
               a$10.set(_123,bar);
               return NONE;
            }
         }))));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$10),before,env.get(ecall).invoke(varargsOf(attempt_$5,new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return new TailcallVarargs(a$10,foo,NONE);
            }
         }))));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$10,mt)));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$10),after,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$10.get(foo);
            }
         })));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$10),after,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$10.get(_123);
            }
         })));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$10),after,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               a$10.set(foo,bar);
               return NONE;
            }
         })));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$10),after,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               a$10.set(_123,bar);
               return NONE;
            }
         })));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$10),after,env.get(ecall).invoke(varargsOf(attempt_,new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return new TailcallVarargs(a$10,foo,NONE);
            }
         }))));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$10,amt$9)));
      }
      env.get(print).call(_______c$1);
      groups$2 = LuaValue.listOf(new LuaValue[]{LuaValue.listOf(new LuaValue[]{atable,afunction,}),LuaValue.listOf(new LuaValue[]{afunction,atable,}),LuaValue.listOf(new LuaValue[]{_123,NIL,}),LuaValue.listOf(new LuaValue[]{NIL,_123,}),});
      final LuaValue concatresult = env.get(setmetat).call(LuaValue.listOf(new LuaValue[]{__concat$1,}),LuaValue.tableOf(new LuaValue[]{__tostri,new ZeroArgFunction(env) {
         public LuaValue call() {
            return concat_s;
         }
      },}));
      final LuaValue concatmt$1 = LuaValue.tableOf(new LuaValue[]{__concat,new TwoArgFunction(env) {
         public LuaValue call(LuaValue a$11,LuaValue b$6) {
            env.get(print).call(mt___con.concat(env.get(type$1).call(a$11).concat(_$2.concat(env.get(type$1).call(b$6).concat(_$1.buffer())))).value(),a$11,b$6);
            return concatresult;
         }
      },});
      for ( double i$10$0=ONE.checkdouble(), i$10$limit=groups$2.len().checkdouble(); i$10$0<=i$10$limit; ++i$10$0 ) {
         final LuaValue i$10 = valueOf(i$10$0);
         final LuaValue a$11 = groups$2.get(i$10).get(ONE);
         final LuaValue b$6 = groups$2.get(i$10).get(_2);
         final LuaValue amt$10 = env.get(debug).get(getmetat).call(a$11);
         final LuaValue bmt$5 = env.get(debug).get(getmetat).call(b$6);
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$11),env.get(type$1).call(b$6),before,},env.get(ecall).invoke(varargsOf(attempt_$6,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$11.concat(b$6);
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$11),env.get(type$1).call(b$6),before,},env.get(ecall).invoke(varargsOf(attempt_$6,new ZeroArgFunction(env) {
            public LuaValue call() {
               return b$6.concat(a$11);
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$11),env.get(type$1).call(sss),env.get(type$1).call(_777),before,},env.get(ecall).invoke(varargsOf(attempt_$6,new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$11.concat(sss.concat(_777.buffer())).value();
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(sss),env.get(type$1).call(a$11),env.get(type$1).call(_777),before,},env.get(ecall).invoke(varargsOf(attempt_$6,new ZeroArgFunction(env) {
            public LuaValue call() {
               return sss.concat(a$11.concat(_777.buffer())).value();
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(sss),env.get(type$1).call(_777),env.get(type$1).call(a$11),before,},env.get(ecall).invoke(varargsOf(attempt_$6,new ZeroArgFunction(env) {
            public LuaValue call() {
               return sss.concat(_777.concat(a$11.buffer())).value();
            }
         }))));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$11,concatmt$1)));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$11),env.get(type$1).call(b$6),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$11.concat(b$6);
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$11),env.get(type$1).call(b$6),after,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return b$6.concat(a$11);
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(a$11),env.get(type$1).call(sss),env.get(type$1).call(_777),before,},env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return a$11.concat(sss.concat(_777.buffer())).value();
            }
         })));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(sss),env.get(type$1).call(a$11),env.get(type$1).call(_777),before,},env.get(ecall).invoke(varargsOf(attempt_$6,new ZeroArgFunction(env) {
            public LuaValue call() {
               return sss.concat(a$11.concat(_777.buffer())).value();
            }
         }))));
         env.get(print).invoke(varargsOf(new LuaValue[] {env.get(type$1).call(sss),env.get(type$1).call(_777),env.get(type$1).call(a$11),before,},env.get(ecall).invoke(varargsOf(attempt_$6,new ZeroArgFunction(env) {
            public LuaValue call() {
               return sss.concat(_777.concat(a$11.buffer())).value();
            }
         }))));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$11,amt$10)));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(b$6,bmt$5)));
      }
      env.get(print).call(_______m);
      values = LuaValue.listOf(new LuaValue[]{FALSE,afunction,athread,atable,abc,});
      final LuaValue mtmt = LuaValue.tableOf(new LuaValue[]{__metata,LuaValue.tableOf(),});
      for ( double i$11$0=ONE.checkdouble(), i$11$limit=values.len().checkdouble(); i$11$0<=i$11$limit; ++i$11$0 ) {
         final LuaValue i$11 = valueOf(i$11$0);
         final LuaValue a$12 = values.get(i$11);
         final LuaValue amt$11 = env.get(debug).get(getmetat).call(a$12);
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$12),before,env.get(pcall).invoke(new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return varargsOf(env.get(debug).get(getmetat).call(a$12),env.get(getmetat).invoke(a$12));
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$12,mtmt)));
         env.get(print).invoke(varargsOf(env.get(type$1).call(a$12),after,env.get(pcall).invoke(new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return varargsOf(env.get(debug).get(getmetat).call(a$12),env.get(getmetat).invoke(a$12));
            }
         })));
         env.get(print).invoke(env.get(debug).get(setmetat).invoke(varargsOf(a$12,amt$11)));
      }
      return NONE;
   }
   static final LuaValue tostring$1 = valueOf("tostring");
   static final LuaValue _111 = valueOf(111);
   static final LuaValue _23_45 = valueOf(23.45);
   static final LuaValue coroutin = valueOf("coroutine");
   static final LuaValue create = valueOf("create");
   static final LuaValue type$1 = valueOf("type");
   static final LuaValue thread = valueOf("thread");
   static final LuaValue function = valueOf("function");
   static final LuaValue table = valueOf("table");
   static final LuaValue _ = valueOf(".");
   static final LuaValue print = valueOf("print");
   static final LuaValue mt___ = valueOf("mt.__");
   static final LuaValue __ = valueOf("()");
   static final LuaValue __$1 = valueOf("__");
   static final LuaValue _result = valueOf("-result");
   static final LuaValue __call = valueOf("__call");
   static final LuaValue call$1 = valueOf("call");
   static final LuaValue __add = valueOf("__add");
   static final LuaValue add$1 = valueOf("add");
   static final LuaValue __sub = valueOf("__sub");
   static final LuaValue sub$1 = valueOf("sub");
   static final LuaValue __mul = valueOf("__mul");
   static final LuaValue mul$1 = valueOf("mul");
   static final LuaValue __div = valueOf("__div");
   static final LuaValue div$1 = valueOf("div");
   static final LuaValue __pow = valueOf("__pow");
   static final LuaValue pow$1 = valueOf("pow");
   static final LuaValue __mod = valueOf("__mod");
   static final LuaValue mod$1 = valueOf("mod");
   static final LuaValue __unm = valueOf("__unm");
   static final LuaValue unm = valueOf("unm");
   static final LuaValue __len = valueOf("__len");
   static final LuaValue len$1 = valueOf("len");
   static final LuaValue __lt = valueOf("__lt");
   static final LuaValue lt$1 = valueOf("lt");
   static final LuaValue __le = valueOf("__le");
   static final LuaValue le = valueOf("le");
   static final LuaValue __index = valueOf("__index");
   static final LuaValue index = valueOf("index");
   static final LuaValue __newind = valueOf("__newindex");
   static final LuaValue newindex = valueOf("newindex");
   static final LuaValue __concat = valueOf("__concat");
   static final LuaValue concat$1 = valueOf("concat");
   static final LuaValue pcall = valueOf("pcall");
   static final LuaValue string = valueOf("string");
   static final LuaValue match = valueOf("match");
   static final LuaValue ecall = valueOf("ecall");
   static final LuaValue _______e = valueOf("---- __eq same types");
   static final LuaValue __eq = valueOf("__eq");
   static final LuaValue eq$1 = valueOf("eq");
   static final LuaValue _123 = valueOf(123);
   static final LuaValue _456 = valueOf(456);
   static final LuaValue _11 = valueOf(11);
   static final LuaValue _5_5 = valueOf(5.5);
   static final LuaValue bthread = valueOf("bthread");
   static final LuaValue abc = valueOf("abc");
   static final LuaValue def = valueOf("def");
   static final LuaValue _2 = valueOf(2);
   static final LuaValue debug = valueOf("debug");
   static final LuaValue getmetat = valueOf("getmetatable");
   static final LuaValue before = valueOf("before");
   static final LuaValue setmetat = valueOf("setmetatable");
   static final LuaValue after = valueOf("after");
   static final LuaValue _______e$1 = valueOf("---- __eq, tables - should invoke metatag comparison");
   static final LuaValue after_a = valueOf("after-a");
   static final LuaValue nilmt = valueOf("nilmt");
   static final LuaValue boolmt = valueOf("boolmt");
   static final LuaValue number = valueOf("number");
   static final LuaValue _______c = valueOf("---- __call");
   static final LuaValue attempt_ = valueOf("attempt to call");
   static final LuaValue a$3 = valueOf("a");
   static final LuaValue b$2 = valueOf("b");
   static final LuaValue c = valueOf("c");
   static final LuaValue d = valueOf("d");
   static final LuaValue _______a = valueOf("---- __add, __sub, __mul, __div, __pow, __mod");
   static final LuaValue attempt_$1 = valueOf("attempt to perform arithmetic");
   static final LuaValue _______l = valueOf("---- __len");
   static final LuaValue attempt_$2 = valueOf("attempt to get length of ");
   static final LuaValue _______n = valueOf("---- __neg");
   static final LuaValue abcd = valueOf("abcd");
   static final LuaValue v = valueOf("v");
   static final LuaValue attempt_$3 = valueOf("attempt to perform arithmetic ");
   static final LuaValue _______l$1 = valueOf("---- __lt, __le, same types");
   static final LuaValue attempt_$4 = valueOf("attempt to compare");
   static final LuaValue _______l$2 = valueOf("---- __lt, __le, different types");
   static final LuaValue _______t = valueOf("---- __tostring");
   static final LuaValue __tostri = valueOf("__tostring");
   static final LuaValue mt___tos = valueOf("mt.__tostring(");
   static final LuaValue _$1 = valueOf(")");
   static final LuaValue _______i = valueOf("---- __index, __newindex");
   static final LuaValue attempt_$5 = valueOf("attempt to index");
   static final LuaValue foo = valueOf("foo");
   static final LuaValue bar = valueOf("bar");
   static final LuaValue _______c$1 = valueOf("---- __concat");
   static final LuaValue __concat$1 = valueOf("__concat-result");
   static final LuaValue concat_s = valueOf("concat-string-result");
   static final LuaValue mt___con = valueOf("mt.__concat(");
   static final LuaValue _$2 = valueOf(",");
   static final LuaValue attempt_$6 = valueOf("attempt to concatenate ");
   static final LuaValue sss = valueOf("sss");
   static final LuaValue _777 = valueOf(777);
   static final LuaValue _______m = valueOf("---- __metatable");
   static final LuaValue __metata = valueOf("__metatable");
}