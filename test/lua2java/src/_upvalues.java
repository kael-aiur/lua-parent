import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _upvalues extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.get(print).call(________);
      final LuaValue simpleupvalues = new ZeroArgFunction(env) {
         public LuaValue call() {
            env.set(test,new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue[] x = {_5};
                  env.set(f,new ZeroArgFunction(env) {
                     public LuaValue call() {
                        x[0] = valueOf(x[0].checkdouble()+1);
                        return x[0];
                     }
                  });
                  env.set(g,new ZeroArgFunction(env) {
                     public LuaValue call() {
                        x[0] = valueOf(x[0].checkdouble()-1);
                        return x[0];
                     }
                  });
                  env.get(print).invoke(env.get(f).invoke());
                  env.get(print).invoke(env.get(g).invoke());
                  return varargsOf(env.get(f),env.get(g));
               }
            });
            final Varargs v = env.get(test).invoke();
            env.set(f1,v.arg1());
            env.set(g1,v.arg(2));
            env.get(print).invoke(varargsOf(f1___,env.get(f1).invoke()));
            env.get(print).invoke(varargsOf(g1___,env.get(g1).invoke()));
            final Varargs v$1 = env.get(test).invoke();
            env.set(f2,v$1.arg1());
            env.set(g2,v$1.arg(2));
            env.get(print).invoke(varargsOf(f2___,env.get(f2).invoke()));
            env.get(print).invoke(varargsOf(g2___,env.get(g2).invoke()));
            env.get(print).invoke(varargsOf(g1___,env.get(g1).invoke()));
            env.get(print).invoke(varargsOf(f1___,env.get(f1).invoke()));
            return NONE;
         }
      };
      env.get(print).invoke(varargsOf(simpleva,env.get(pcall).invoke(simpleupvalues)));
      env.get(print).call(________$1);
      final LuaValue middleupvaluestest = new ZeroArgFunction(env) {
         public LuaValue call() {
            final LuaValue test$1 = new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue[] x = {_3};
                  final LuaValue[] y = {_5};
                  final LuaValue[] z = {_7};
                  final LuaValue f$1 = new ZeroArgFunction(env) {
                     public LuaValue call() {
                        env.get(print).call(y_,y[0]);
                        return NONE;
                     }
                  };
                  final LuaValue g$1 = new ZeroArgFunction(env) {
                     public LuaValue call() {
                        env.get(print).call(z_,z[0]);
                        return NONE;
                     }
                  };
                  final LuaValue h = new ZeroArgFunction(env) {
                     public LuaValue call() {
                        env.get(print).call(x_,x[0]);
                        return NONE;
                     }
                  };
                  final LuaValue setter = new ThreeArgFunction(env) {
                     public LuaValue call(LuaValue x1,LuaValue y1,LuaValue z1) {
                        x[0] = x1;
                        y[0] = y1;
                        z[0] = z1;
                        return NONE;
                     }
                  };
                  return varargsOf(new LuaValue[] {f$1,g$1,h,},setter);
               }
            };
            final Varargs t = test$1.invoke();
            final LuaValue f$1 = t.arg1();
            final LuaValue g$1 = t.arg(2);
            final LuaValue h = t.arg(3);
            final LuaValue setter = t.arg(4);
            h.call();
            f$1.call();
            g$1.call();
            setter.call(x,y,z);
            h.call();
            f$1.call();
            g$1.call();
            return NONE;
         }
      };
      env.get(print).invoke(env.get(pcall).invoke(middleupvaluestest));
      env.get(print).call(________$2);
      final LuaValue nestedupvaluestest = new ZeroArgFunction(env) {
         public LuaValue call() {
            final LuaValue[] f$1 = {NIL};
            {
               env.set(g,new ZeroArgFunction(env) {
                  public LuaValue call() {
                     env.get(print).invoke(varargsOf(_10,f$1[0].invoke()));
                     return NONE;
                  }
               });
            }
            f$1[0] = new ZeroArgFunction(env) {
               public LuaValue call() {
                  return _20;
               }
            };
            env.get(g).call();
            return NONE;
         }
      };
      env.get(print).invoke(varargsOf(nestedup,env.get(pcall).invoke(nestedupvaluestest)));
      return NONE;
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue ________ = valueOf("-------- simple upvalues tests --------");
   static final LuaValue _5 = valueOf(5);
   static final LuaValue f = valueOf("f");
   static final LuaValue g = valueOf("g");
   static final LuaValue test = valueOf("test");
   static final LuaValue f1 = valueOf("f1");
   static final LuaValue g1 = valueOf("g1");
   static final LuaValue f1___ = valueOf("f1()=");
   static final LuaValue g1___ = valueOf("g1()=");
   static final LuaValue f2 = valueOf("f2");
   static final LuaValue g2 = valueOf("g2");
   static final LuaValue f2___ = valueOf("f2()=");
   static final LuaValue g2___ = valueOf("g2()=");
   static final LuaValue simpleva = valueOf("simplevalues result:");
   static final LuaValue pcall = valueOf("pcall");
   static final LuaValue ________$1 = valueOf("----------- upvalued in middle ------------");
   static final LuaValue _3 = valueOf(3);
   static final LuaValue _7 = valueOf(7);
   static final LuaValue y_ = valueOf("y=");
   static final LuaValue z_ = valueOf("z=");
   static final LuaValue x_ = valueOf("x=");
   static final LuaValue x = valueOf("x");
   static final LuaValue y = valueOf("y");
   static final LuaValue z = valueOf("z");
   static final LuaValue ________$2 = valueOf("--------- nested upvalues ----------");
   static final LuaValue _10 = valueOf(10);
   static final LuaValue _20 = valueOf(20);
   static final LuaValue nestedup = valueOf("nestedupvaluestest result:");
}