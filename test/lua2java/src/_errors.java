import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _errors extends VarArgFunction {
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
      final LuaValue a = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            final Varargs t = env.get(pcall).invoke($arg);
            final LuaValue s = t.arg1();
            final LuaValue e = t.arg(2);
            if ( s.toboolean() ) {
               return varargsOf(s,e);
            } else {
               return varargsOf(FALSE,env.get(type$1).invoke(e));
            }
         }
      };
      env.set(s,some_str);
      final LuaValue[] t = {LuaValue.tableOf()};
      env.get(print).invoke(varargsOf(a_error_,a.invoke(env.get(error$1))));
      env.get(print).invoke(varargsOf(a_error_$1,a.invoke(varargsOf(env.get(error$1),msg))));
      env.get(print).invoke(varargsOf(a_error_$2,a.invoke(varargsOf(env.get(error$1),msg,ZERO))));
      env.get(print).invoke(varargsOf(a_error_$3,a.invoke(varargsOf(env.get(error$1),msg,ONE))));
      env.get(print).invoke(varargsOf(a_error_$4,a.invoke(varargsOf(env.get(error$1),msg,_2))));
      env.get(print).invoke(varargsOf(a_error_$5,a.invoke(varargsOf(env.get(error$1),msg,_3))));
      env.get(print).invoke(varargsOf(a_error_$6,a.invoke(varargsOf(env.get(error$1),msg,_4))));
      env.get(print).invoke(varargsOf(a_error_$7,a.invoke(varargsOf(env.get(error$1),msg,_5))));
      env.get(print).invoke(varargsOf(a_error_$8,a.invoke(varargsOf(env.get(error$1),msg,_6))));
      env.get(print).invoke(varargsOf(a_nil___,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(n),NONE);
         }
      })));
      env.get(print).invoke(varargsOf(a_t_____,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(t[0],NONE);
         }
      })));
      env.get(print).invoke(varargsOf(a_s_____,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(s),NONE);
         }
      })));
      env.get(print).invoke(varargsOf(a_true__,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(TRUE,NONE);
         }
      })));
      env.get(print).invoke(varargsOf(a_nil_1_,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return valueOf(NIL.checkdouble()+1);
         }
      })));
      env.get(print).invoke(varargsOf(a_a_1___,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return valueOf(a.checkdouble()+1);
         }
      })));
      env.get(print).invoke(varargsOf(a_s_1___,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return valueOf(env.get(s).checkdouble()+1);
         }
      })));
      env.get(print).invoke(varargsOf(a_true_1,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return valueOf(TRUE.checkdouble()+1);
         }
      })));
      env.get(print).invoke(varargsOf(a_nil_x_,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return env.get(n).get(x);
         }
      })));
      env.get(print).invoke(varargsOf(a_a_x___,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return a.get(x);
         }
      })));
      env.get(print).invoke(varargsOf(a_s_x___,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return env.get(s).get(x);
         }
      })));
      env.get(print).invoke(varargsOf(a_true_x,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return TRUE.get(x);
         }
      })));
      env.get(print).invoke(varargsOf(a_nil_x_$1,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            env.get(n).set(x,_5);
            return NONE;
         }
      })));
      env.get(print).invoke(varargsOf(a_a_x_5_,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            a.set(x,_5);
            return NONE;
         }
      })));
      env.get(print).invoke(varargsOf(a_s_x_5_,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            env.get(s).set(x,_5);
            return NONE;
         }
      })));
      env.get(print).invoke(varargsOf(a_true_x$1,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            TRUE.set(x,_5);
            return NONE;
         }
      })));
      env.get(print).invoke(varargsOf(a__nil__,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return env.get(n).len();
         }
      })));
      env.get(print).invoke(varargsOf(a__t____,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return t[0].len();
         }
      })));
      env.get(print).invoke(varargsOf(a__s____,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return env.get(s).len();
         }
      })));
      env.get(print).invoke(varargsOf(a__a____,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return a.len();
         }
      })));
      env.get(print).invoke(varargsOf(a__true_,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return TRUE.len();
         }
      })));
      env.get(print).invoke(varargsOf(a_nil_1_$1,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return NIL.gt(ONE);
         }
      })));
      env.get(print).invoke(varargsOf(a_a_1___$1,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return a.gt(ONE);
         }
      })));
      env.get(print).invoke(varargsOf(a_s_1___$1,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return env.get(s).gt(ONE);
         }
      })));
      env.get(print).invoke(varargsOf(a_true_1$1,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return TRUE.gt(ONE);
         }
      })));
      env.get(print).invoke(varargsOf(a__nil_,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return env.get(n).neg();
         }
      })));
      env.get(print).invoke(varargsOf(a__a___,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return a.neg();
         }
      })));
      env.get(print).invoke(varargsOf(a__s___,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return env.get(s).neg();
         }
      })));
      env.get(print).invoke(varargsOf(a__true_$1,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return TRUE.neg();
         }
      })));
      final LuaValue concatsuite = new OneArgFunction(env) {
         public LuaValue call(LuaValue comparefunc) {
            env.get(print).invoke(varargsOf(_a____b_,comparefunc.invoke(varargsOf(a$1,b))));
            env.get(print).invoke(varargsOf(_a___nil,comparefunc.invoke(varargsOf(a$1,NIL))));
            env.get(print).invoke(varargsOf(nil___b_,comparefunc.invoke(varargsOf(NIL,b))));
            env.get(print).invoke(varargsOf(_a_____,comparefunc.invoke(varargsOf(a$1,LuaValue.tableOf()))));
            env.get(print).invoke(varargsOf(_____b_,comparefunc.invoke(varargsOf(LuaValue.tableOf(),b))));
            env.get(print).invoke(varargsOf(_a___2,comparefunc.invoke(varargsOf(a$1,_2))));
            env.get(print).invoke(varargsOf(_2___b_,comparefunc.invoke(varargsOf(_2,b))));
            env.get(print).invoke(varargsOf(_a___pri,comparefunc.invoke(varargsOf(a$1,env.get(print)))));
            env.get(print).invoke(varargsOf(print___,comparefunc.invoke(varargsOf(env.get(print),b))));
            env.get(print).invoke(varargsOf(_a___tru,comparefunc.invoke(varargsOf(a$1,TRUE))));
            env.get(print).invoke(varargsOf(true___b,comparefunc.invoke(varargsOf(TRUE,b))));
            env.get(print).invoke(varargsOf(nil__tru,comparefunc.invoke(varargsOf(NIL,TRUE))));
            env.get(print).invoke(varargsOf(_a___3_5,comparefunc.invoke(varargsOf(a$1,_3_5))));
            env.get(print).invoke(varargsOf(_3_5___b_,comparefunc.invoke(varargsOf(_3_5,b))));
            return NONE;
         }
      };
      final LuaValue strconcat = new TwoArgFunction(env) {
         public LuaValue call(LuaValue a$2$0,LuaValue b$1$0) {
            final LuaValue a$2 = a$2$0;
            final LuaValue b$1 = b$1$0;
            return env.get(pcall).call(new ZeroArgFunction(env) {
               public LuaValue call() {
                  return a$2.concat(b$1);
               }
            });
         }
      };
      final LuaValue tblconcat = new TwoArgFunction(env) {
         public LuaValue call(LuaValue a$2,LuaValue b$1) {
            final LuaValue t$1 = LuaValue.listOf(new LuaValue[]{a$2,b$1,});
            return env.get(pcall).call(new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  return new TailcallVarargs(env.get(table).get(concat$1),varargsOf(new LuaValue[] {t$1,_$1,ONE,},_2));
               }
            });
         }
      };
      env.get(print).call(________);
      concatsuite.call(strconcat);
      env.get(print).call(________$1);
      concatsuite.call(tblconcat);
      env.get(print).call(________$2);
      env.get(print).invoke(varargsOf(a_pairs_,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(pairs),varargsOf(NIL,LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_pairs_$1,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(pairs),varargsOf(a,LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_pairs_$2,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(pairs),varargsOf(env.get(s),LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_pairs_$3,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(pairs),varargsOf(t[0],LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_pairs_$4,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(pairs),varargsOf(TRUE,LuaValue.tableOf()));
         }
      })));
      env.get(print).call(________$3);
      env.set(sm,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            return new TailcallVarargs(env.get(tostring$1),env.get(setmetat).invoke($arg));
         }
      });
      env.get(print).invoke(varargsOf(a_setmet,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(NIL,LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_setmet$1,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(a,LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_setmet$2,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(env.get(s),LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_setmet$3,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(TRUE,LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_setmet$4,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(t[0],LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_getmet,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return varargsOf(env.get(getmetat).call(t[0]),env.get(type$1).invoke(env.get(getmetat).invoke(t[0])));
         }
      })));
      env.get(print).invoke(varargsOf(a_setmet$5,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(t[0],LuaValue.tableOf(new LuaValue[]{__metata,LuaValue.tableOf(),})));
         }
      })));
      env.get(print).invoke(varargsOf(a_getmet,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return varargsOf(env.get(getmetat).call(t[0]),env.get(type$1).invoke(env.get(getmetat).invoke(t[0])));
         }
      })));
      env.get(print).invoke(varargsOf(a_setmet$4,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(t[0],LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_getmet,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return varargsOf(env.get(getmetat).call(t[0]),env.get(type$1).invoke(env.get(getmetat).invoke(t[0])));
         }
      })));
      t[0] = LuaValue.tableOf();
      env.get(print).invoke(varargsOf(a_setmet$4,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(t[0],LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_getmet,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return varargsOf(env.get(getmetat).call(t[0]),env.get(type$1).invoke(env.get(getmetat).invoke(t[0])));
         }
      })));
      env.get(print).invoke(varargsOf(a_setmet$5,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(t[0],LuaValue.tableOf(new LuaValue[]{__metata,some_str,})));
         }
      })));
      env.get(print).invoke(varargsOf(a_getmet,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return varargsOf(env.get(getmetat).call(t[0]),env.get(type$1).invoke(env.get(getmetat).invoke(t[0])));
         }
      })));
      env.get(print).invoke(varargsOf(a_setmet$4,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(t[0],LuaValue.tableOf()));
         }
      })));
      env.get(print).invoke(varargsOf(a_getmet,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return varargsOf(env.get(getmetat).call(t[0]),env.get(type$1).invoke(env.get(getmetat).invoke(t[0])));
         }
      })));
      env.get(print).invoke(varargsOf(a_setmet$6,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(t[0],NIL));
         }
      })));
      env.get(print).invoke(varargsOf(a_setmet$4,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),t[0]);
         }
      })));
      env.get(print).invoke(varargsOf(a_setmet$7,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(sm),varargsOf(LuaValue.tableOf(),abc));
         }
      })));
      env.get(print).invoke(varargsOf(error__m,a.invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            env.get(error$1).call(some_mes,some_bad);
            return NONE;
         }
      })));
      env.get(print).invoke(varargsOf(loadfile,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(loadfile$1),bogus_tx);
         }
      })));
      env.get(print).invoke(varargsOf(dofile__,a.invoke(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(dofile),bogus_tx);
         }
      })));
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
   static final LuaValue some_str = valueOf("some string");
   static final LuaValue s = valueOf("s");
   static final LuaValue print = valueOf("print");
   static final LuaValue a_error_ = valueOf("a(error)");
   static final LuaValue error$1 = valueOf("error");
   static final LuaValue a_error_$1 = valueOf("a(error,\"msg\")");
   static final LuaValue msg = valueOf("msg");
   static final LuaValue a_error_$2 = valueOf("a(error,\"msg\",0)");
   static final LuaValue a_error_$3 = valueOf("a(error,\"msg\",1)");
   static final LuaValue a_error_$4 = valueOf("a(error,\"msg\",2)");
   static final LuaValue _2 = valueOf(2);
   static final LuaValue a_error_$5 = valueOf("a(error,\"msg\",3)");
   static final LuaValue _3 = valueOf(3);
   static final LuaValue a_error_$6 = valueOf("a(error,\"msg\",4)");
   static final LuaValue _4 = valueOf(4);
   static final LuaValue a_error_$7 = valueOf("a(error,\"msg\",5)");
   static final LuaValue _5 = valueOf(5);
   static final LuaValue a_error_$8 = valueOf("a(error,\"msg\",6)");
   static final LuaValue _6 = valueOf(6);
   static final LuaValue a_nil___ = valueOf("a(nil())");
   static final LuaValue n = valueOf("n");
   static final LuaValue a_t_____ = valueOf("a(t())  ");
   static final LuaValue a_s_____ = valueOf("a(s())  ");
   static final LuaValue a_true__ = valueOf("a(true())");
   static final LuaValue a_nil_1_ = valueOf("a(nil+1)");
   static final LuaValue a_a_1___ = valueOf("a(a+1)  ");
   static final LuaValue a_s_1___ = valueOf("a(s+1)  ");
   static final LuaValue a_true_1 = valueOf("a(true+1)");
   static final LuaValue a_nil_x_ = valueOf("a(nil.x)");
   static final LuaValue x = valueOf("x");
   static final LuaValue a_a_x___ = valueOf("a(a.x)  ");
   static final LuaValue a_s_x___ = valueOf("a(s.x)  ");
   static final LuaValue a_true_x = valueOf("a(true.x)");
   static final LuaValue a_nil_x_$1 = valueOf("a(nil.x=5)");
   static final LuaValue a_a_x_5_ = valueOf("a(a.x=5)  ");
   static final LuaValue a_s_x_5_ = valueOf("a(s.x=5)  ");
   static final LuaValue a_true_x$1 = valueOf("a(true.x=5)");
   static final LuaValue a__nil__ = valueOf("a(#nil) ");
   static final LuaValue a__t____ = valueOf("a(#t)   ");
   static final LuaValue a__s____ = valueOf("a(#s)   ");
   static final LuaValue a__a____ = valueOf("a(#a)   ");
   static final LuaValue a__true_ = valueOf("a(#true)");
   static final LuaValue a_nil_1_$1 = valueOf("a(nil>1)");
   static final LuaValue a_a_1___$1 = valueOf("a(a>1)  ");
   static final LuaValue a_s_1___$1 = valueOf("a(s>1)  ");
   static final LuaValue a_true_1$1 = valueOf("a(true>1)");
   static final LuaValue a__nil_ = valueOf("a(-nil)");
   static final LuaValue a__a___ = valueOf("a(-a)  ");
   static final LuaValue a__s___ = valueOf("a(-s)  ");
   static final LuaValue a__true_$1 = valueOf("a(-true)");
   static final LuaValue _a____b_ = valueOf("\"a\"..\"b\"");
   static final LuaValue a$1 = valueOf("a");
   static final LuaValue b = valueOf("b");
   static final LuaValue _a___nil = valueOf("\"a\"..nil");
   static final LuaValue nil___b_ = valueOf("nil..\"b\"");
   static final LuaValue _a_____ = valueOf("\"a\"..{}");
   static final LuaValue _____b_ = valueOf("{}..\"b\"");
   static final LuaValue _a___2 = valueOf("\"a\"..2");
   static final LuaValue _2___b_ = valueOf("2..\"b\"");
   static final LuaValue _a___pri = valueOf("\"a\"..print");
   static final LuaValue print___ = valueOf("print..\"b\"");
   static final LuaValue _a___tru = valueOf("\"a\"..true");
   static final LuaValue true___b = valueOf("true..\"b\"");
   static final LuaValue nil__tru = valueOf("nil..true");
   static final LuaValue _a___3_5 = valueOf("\"a\"..3.5");
   static final LuaValue _3_5 = valueOf(3.5);
   static final LuaValue _3_5___b_ = valueOf("3.5..\"b\"");
   static final LuaValue concat$1 = valueOf("concat");
   static final LuaValue _$1 = valueOf("-");
   static final LuaValue ________ = valueOf("-------- string concatenation");
   static final LuaValue ________$1 = valueOf("-------- table concatenation");
   static final LuaValue ________$2 = valueOf("-------- pairs tests");
   static final LuaValue a_pairs_ = valueOf("a(pairs(nil))");
   static final LuaValue pairs = valueOf("pairs");
   static final LuaValue a_pairs_$1 = valueOf("a(pairs(a))  ");
   static final LuaValue a_pairs_$2 = valueOf("a(pairs(s))  ");
   static final LuaValue a_pairs_$3 = valueOf("a(pairs(t))  ");
   static final LuaValue a_pairs_$4 = valueOf("a(pairs(true))");
   static final LuaValue ________$3 = valueOf("-------- setmetatable tests");
   static final LuaValue setmetat = valueOf("setmetatable");
   static final LuaValue sm = valueOf("sm");
   static final LuaValue a_setmet = valueOf("a(setmetatable(nil))");
   static final LuaValue a_setmet$1 = valueOf("a(setmetatable(a))  ");
   static final LuaValue a_setmet$2 = valueOf("a(setmetatable(s))  ");
   static final LuaValue a_setmet$3 = valueOf("a(setmetatable(true))");
   static final LuaValue a_setmet$4 = valueOf("a(setmetatable(t))  ");
   static final LuaValue a_getmet = valueOf("a(getmetatable(t))  ");
   static final LuaValue getmetat = valueOf("getmetatable");
   static final LuaValue a_setmet$5 = valueOf("a(setmetatable(t*))  ");
   static final LuaValue __metata = valueOf("__metatable");
   static final LuaValue a_setmet$6 = valueOf("a(setmetatable(t,nil))  ");
   static final LuaValue a_setmet$7 = valueOf("a(setmetatable({},\"abc\"))  ");
   static final LuaValue abc = valueOf("abc");
   static final LuaValue error__m = valueOf("error(\"msg\",\"arg\")");
   static final LuaValue some_mes = valueOf("some message");
   static final LuaValue some_bad = valueOf("some bad arg");
   static final LuaValue loadfile = valueOf("loadfile(\"bogus.txt\")");
   static final LuaValue loadfile$1 = valueOf("loadfile");
   static final LuaValue bogus_tx = valueOf("bogus.txt");
   static final LuaValue dofile__ = valueOf("dofile(\"bogus.txt\")");
   static final LuaValue dofile = valueOf("dofile");
}