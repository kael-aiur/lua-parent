import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _coroutinelib extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue $b;
      env.set(printrun,new ZeroArgFunction(env) {
         public LuaValue call() {
            if ( env.get(coroutin).get(running).call().eq_b(NIL) ) {
               env.get(print).call(running_);
            } else {
               env.get(print).call(running_$1);
            }
            return NONE;
         }
      });
      env.set(foo,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            env.get(print).call(foo,a);
            return new TailcallVarargs(env.get(coroutin).get(yield),valueOf(2*a.checkdouble()));
         }
      });
      env.set(co,env.get(coroutin).get(create).call(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            final LuaValue b = $arg.arg(2);
            env.get(print).call(co_body,a,b);
            final LuaValue r = env.get(foo).call(valueOf(a.checkdouble()+1));
            env.get(print).call(co_body,r);
            final Varargs t = env.get(coroutin).get(yield).invoke(varargsOf(valueOf(a.checkdouble()+b.checkdouble()),valueOf(a.checkdouble()-b.checkdouble())));
            final LuaValue r$1 = t.arg1();
            final LuaValue s = t.arg(2);
            env.get(print).call(co_body,r$1,s);
            env.get(printrun).call();
            env.get(print).invoke(varargsOf(co_statu,env.get(coroutin).get(status).invoke(env.get(co))));
            final LuaValue co2 = env.get(coroutin).get(create).call(new ZeroArgFunction(env) {
               public LuaValue call() {
                  env.get(print).invoke(varargsOf(co_statu$1,env.get(coroutin).get(status).invoke(env.get(co))));
                  return NONE;
               }
            });
            env.get(print).invoke(varargsOf(co_statu,env.get(coroutin).get(status).invoke(env.get(co))));
            env.get(coroutin).get(resume).call(co2);
            return varargsOf(b,end);
         }
      }));
      env.set(exercise,new ZeroArgFunction(env) {
         public LuaValue call() {
            env.get(printrun).call();
            env.get(print).invoke(varargsOf(co_statu$2,env.get(coroutin).get(status).invoke(env.get(co))));
            env.get(print).invoke(varargsOf(main,env.get(coroutin).get(resume).invoke(varargsOf(env.get(co),ONE,_10))));
            env.get(print).invoke(varargsOf(co_statu$2,env.get(coroutin).get(status).invoke(env.get(co))));
            env.get(print).invoke(varargsOf(main,env.get(coroutin).get(resume).invoke(varargsOf(env.get(co),r))));
            env.get(print).invoke(varargsOf(co_statu$2,env.get(coroutin).get(status).invoke(env.get(co))));
            env.get(print).invoke(varargsOf(main,env.get(coroutin).get(resume).invoke(varargsOf(env.get(co),x,y))));
            env.get(print).invoke(varargsOf(co_statu$2,env.get(coroutin).get(status).invoke(env.get(co))));
            env.get(print).invoke(varargsOf(main,env.get(coroutin).get(resume).invoke(varargsOf(env.get(co),x,y))));
            env.get(print).invoke(varargsOf(co_statu$2,env.get(coroutin).get(status).invoke(env.get(co))));
            return NONE;
         }
      });
      env.get(exercise).call();
      env.set(co,env.get(coroutin).get(create).call(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            final LuaValue b = $arg.arg(2);
            env.get(print).call(co_body,a,b);
            env.get(foo).call(valueOf(a.checkdouble()+1));
            env.get(print).call(co_body,env.get(status),env.get(r));
            final Varargs t = env.get(coroutin).get(yield).invoke(varargsOf(valueOf(a.checkdouble()+b.checkdouble()),valueOf(a.checkdouble()-b.checkdouble())));
            final LuaValue r$1 = t.arg1();
            final LuaValue s = t.arg(2);
            env.get(print).call(co_body,r$1,s);
            return varargsOf(b,end);
         }
      }));
      env.get(exercise).call();
      final LuaValue g = env.get(coroutin).get(wrap).call(new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            final LuaValue b = $arg.arg(2);
            env.get(print).call(co_body,a,b);
            final LuaValue r$1 = env.get(foo).call(valueOf(a.checkdouble()+1));
            env.get(print).call(co_body,r$1);
            final Varargs t = env.get(coroutin).get(yield).invoke(varargsOf(valueOf(a.checkdouble()+b.checkdouble()),valueOf(a.checkdouble()-b.checkdouble())));
            final LuaValue r$2 = t.arg1();
            final LuaValue s = t.arg(2);
            env.get(print).call(co_body,r$2,s);
            return varargsOf(b,end);
         }
      });
      env.get(print).invoke(varargsOf(g$1,g.invoke(varargsOf(ONE,_10))));
      env.get(print).invoke(varargsOf(g$1,g.invoke(r)));
      env.get(print).invoke(varargsOf(g$1,g.invoke(varargsOf(x,y))));
      final Varargs t = env.get(pcall).invoke(varargsOf(g,x,y));
      final LuaValue s = t.arg1();
      final LuaValue e = t.arg(2);
      env.get(print).call(g$1,(($b=env.get(string).get(match).call(e,cannot_r)).toboolean()?$b:badmessa.concat(env.get(tostring$1).call(e))));
      final LuaValue echo = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue msg = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            env.get(print).invoke(varargsOf(msg,$arg));
            return $arg;
         }
      };
      final LuaValue echocr = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = LuaValue.tableOf($arg,1);
            echo.invoke(varargsOf(_echocr_,env.get(unpack).invoke(varargsOf(arg,ONE,arg.get(n)))));
            LuaValue a = arg;
            while (true) {
               a = LuaValue.listOf(new LuaValue[]{}, echo.invoke(varargsOf(_echoch_,env.get(coroutin).get(yield).invoke(env.get(unpack).invoke(a)))));
            }
         }
      };
      final LuaValue[] c = {env.get(coroutin).get(create).call(echocr)};
      final LuaValue step = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            echo.invoke(varargsOf(_main__r,env.get(coroutin).get(resume).invoke(varargsOf(c[0],echo.invoke(varargsOf(_main__s,$arg))))));
            return NONE;
         }
      };
      step.call(_111,_222,_333);
      step.call();
      step.call(_111);
      step.call(_111,_222,_333);
      env.set(b,env.get(coroutin).get(create).call(new OneArgFunction(env) {
         public LuaValue call(LuaValue arg$1) {
            while (true) {
               env.get(print).call(__b_resu,arg$1,env.get(b).eq(env.get(coroutin).get(running).call()));
               env.get(print).invoke(varargsOf(__b_b,env.get(coroutin).get(status).invoke(env.get(b))));
               env.get(print).invoke(varargsOf(__b_c,env.get(coroutin).get(status).invoke(c[0])));
               env.get(print).invoke(varargsOf(__b_resu$1,env.get(coroutin).get(resume).invoke(varargsOf(env.get(b),b_arg_fo))));
               env.get(print).invoke(varargsOf(__b_resu$2,env.get(coroutin).get(resume).invoke(varargsOf(c[0],b_arg_fo$1))));
               arg$1 = env.get(coroutin).get(yield).call(b_rslt);
            }
         }
      }));
      c[0] = env.get(coroutin).get(create).call(new OneArgFunction(env) {
         public LuaValue call(LuaValue arg$1) {
            for ( double i$0=ONE.checkdouble(), i$limit=_3.checkdouble(); i$0<=i$limit; ++i$0 ) {
               final LuaValue i = valueOf(i$0);
               env.get(print).call(____c_re,arg$1,c[0].eq(env.get(coroutin).get(running).call()));
               env.get(print).invoke(varargsOf(____c_b,env.get(coroutin).get(status).invoke(env.get(b))));
               env.get(print).invoke(varargsOf(____c_c,env.get(coroutin).get(status).invoke(c[0])));
               env.get(print).invoke(varargsOf(____c_re$1,env.get(coroutin).get(resume).invoke(varargsOf(env.get(b),b_arg_fo))));
               env.get(print).invoke(varargsOf(____c_re$2,env.get(coroutin).get(resume).invoke(varargsOf(c[0],b_arg_fo$1))));
               arg$1 = env.get(coroutin).get(yield).call(c_rslt);
            }
            return NONE;
         }
      });
      for ( double i$0=ONE.checkdouble(), i$limit=_3.checkdouble(); i$0<=i$limit; ++i$0 ) {
         final LuaValue i = valueOf(i$0);
         env.get(print).invoke(varargsOf(main_b,env.get(coroutin).get(status).invoke(env.get(b))));
         env.get(print).invoke(varargsOf(main_c,env.get(coroutin).get(status).invoke(c[0])));
         env.get(print).invoke(varargsOf(main_res,env.get(coroutin).get(resume).invoke(varargsOf(env.get(b),main_arg))));
         env.get(print).invoke(varargsOf(main_res$1,env.get(coroutin).get(resume).invoke(varargsOf(c[0],main_arg$1))));
      }
      return NONE;
   }
   static final LuaValue coroutin = valueOf("coroutine");
   static final LuaValue running = valueOf("running");
   static final LuaValue print = valueOf("print");
   static final LuaValue running_ = valueOf("running is nil");
   static final LuaValue running_$1 = valueOf("running is not nil");
   static final LuaValue printrun = valueOf("printrunning");
   static final LuaValue foo = valueOf("foo");
   static final LuaValue yield = valueOf("yield");
   static final LuaValue create = valueOf("create");
   static final LuaValue co_body = valueOf("co-body");
   static final LuaValue co_statu = valueOf("co.status.inside");
   static final LuaValue status = valueOf("status");
   static final LuaValue co = valueOf("co");
   static final LuaValue co_statu$1 = valueOf("co.status.inside2");
   static final LuaValue resume = valueOf("resume");
   static final LuaValue end = valueOf("end");
   static final LuaValue co_statu$2 = valueOf("co.status");
   static final LuaValue main = valueOf("main");
   static final LuaValue _10 = valueOf(10);
   static final LuaValue r = valueOf("r");
   static final LuaValue x = valueOf("x");
   static final LuaValue y = valueOf("y");
   static final LuaValue exercise = valueOf("exercise");
   static final LuaValue wrap = valueOf("wrap");
   static final LuaValue g$1 = valueOf("g");
   static final LuaValue pcall = valueOf("pcall");
   static final LuaValue string = valueOf("string");
   static final LuaValue match = valueOf("match");
   static final LuaValue cannot_r = valueOf("cannot resume dead coroutine");
   static final LuaValue badmessa = valueOf("badmessage: ");
   static final LuaValue tostring$1 = valueOf("tostring");
   static final LuaValue _echocr_ = valueOf("(echocr) first args");
   static final LuaValue unpack = valueOf("unpack");
   static final LuaValue n = valueOf("n");
   static final LuaValue _echoch_ = valueOf("(echoch) yield returns");
   static final LuaValue _main__r = valueOf("(main) resume returns");
   static final LuaValue _main__s = valueOf("(main) sending args");
   static final LuaValue _111 = valueOf(111);
   static final LuaValue _222 = valueOf(222);
   static final LuaValue _333 = valueOf(333);
   static final LuaValue __b_resu = valueOf("  b-resumed");
   static final LuaValue b = valueOf("b");
   static final LuaValue __b_b = valueOf("  b-b");
   static final LuaValue __b_c = valueOf("  b-c");
   static final LuaValue __b_resu$1 = valueOf("  b-resume-b");
   static final LuaValue b_arg_fo = valueOf("b-arg-for-b");
   static final LuaValue __b_resu$2 = valueOf("  b-resume-c");
   static final LuaValue b_arg_fo$1 = valueOf("b-arg-for-c");
   static final LuaValue b_rslt = valueOf("b-rslt");
   static final LuaValue _3 = valueOf(3);
   static final LuaValue ____c_re = valueOf("    c-resumed");
   static final LuaValue ____c_b = valueOf("    c-b");
   static final LuaValue ____c_c = valueOf("    c-c");
   static final LuaValue ____c_re$1 = valueOf("    c-resume-b");
   static final LuaValue ____c_re$2 = valueOf("    c-resume-c");
   static final LuaValue c_rslt = valueOf("c-rslt");
   static final LuaValue main_b = valueOf("main-b");
   static final LuaValue main_c = valueOf("main-c");
   static final LuaValue main_res = valueOf("main-resume-b");
   static final LuaValue main_arg = valueOf("main-arg-for-b");
   static final LuaValue main_res$1 = valueOf("main-resume-c");
   static final LuaValue main_arg$1 = valueOf("main-arg-for-c");
}