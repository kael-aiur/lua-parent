import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _vm extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.get(print).call(________);
      env.get(print).call(___boole);
      final LuaValue booleantests = new ZeroArgFunction(env) {
         public LuaValue call() {
            LuaValue $b;
            env.set(t,TRUE);
            env.set(f,FALSE);
            env.set(n,NIL);
            env.set(s,Hello);
            env.set(z,ZERO);
            env.set(one,ONE);
            env.get(print).call(env.get(t));
            env.get(print).call(env.get(f));
            env.get(print).call(env.get(t).not());
            env.get(print).call(env.get(f).not());
            env.get(print).call(env.get(n).not());
            env.get(print).call(env.get(z).not());
            env.get(print).call(env.get(s).not());
            env.get(print).call(env.get(t).not().not());
            env.get(print).call(env.get(z).not().not());
            env.get(print).call(env.get(n).not().not());
            env.get(print).call((!($b=env.get(t)).toboolean()?$b:env.get(f)));
            env.get(print).call((($b=env.get(t)).toboolean()?$b:env.get(f)));
            env.get(print).call((!($b=env.get(f)).toboolean()?$b:env.get(t)));
            env.get(print).call((($b=env.get(f)).toboolean()?$b:env.get(t)));
            env.get(print).call((($b=env.get(f)).toboolean()?$b:env.get(one)));
            env.get(print).call((($b=env.get(f)).toboolean()?$b:env.get(z)));
            env.get(print).call((($b=env.get(f)).toboolean()?$b:env.get(n)));
            env.get(print).call((!($b=env.get(t)).toboolean()?$b:env.get(one)));
            env.get(print).call((!($b=env.get(t)).toboolean()?$b:env.get(z)));
            env.get(print).call((!($b=env.get(t)).toboolean()?$b:env.get(n)));
            return NONE;
         }
      };
      env.get(print).invoke(varargsOf(booleant,env.get(pcall).invoke(booleantests)));
      env.get(print).call(________$1);
      final LuaValue varargstest = new ZeroArgFunction(env) {
         public LuaValue call() {
            env.set(p,new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue a = $arg.arg1();
                  $arg = $arg.subargs(2);
                  final LuaValue arg = NIL;
                  env.get(print).call(a$1,a);
                  env.get(print).invoke(varargsOf(___,$arg));
                  env.get(print).call(____a,$arg.arg1(),a);
                  env.get(print).invoke(varargsOf(a____,a,$arg));
                  return NONE;
               }
            });
            env.set(q,new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue a = $arg.arg1();
                  $arg = $arg.subargs(2);
                  final LuaValue arg = LuaValue.tableOf($arg,1);
                  env.get(print).invoke(varargsOf(new LuaValue[] {a_arg_1_,a,arg.get(n),arg.get(ONE),arg.get(_2),},arg.get(_3)));
                  return NONE;
               }
            });
            env.set(r,new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue a = $arg.arg1();
                  $arg = $arg.subargs(2);
                  final LuaValue arg = NIL;
                  env.get(print).call(a_arg,a,arg);
                  env.get(print).call(a$1,a);
                  env.get(print).invoke(varargsOf(___,$arg));
                  env.get(print).call(____a,$arg.arg1(),a);
                  env.get(print).invoke(varargsOf(a____,a,$arg));
                  return NONE;
               }
            });
            env.set(s,new OneArgFunction(env) {
               public LuaValue call(LuaValue a) {
                  final LuaValue arg$1 = LuaValue.listOf(new LuaValue[]{_1,_2$1,_3$1,});
                  env.get(print).invoke(varargsOf(new LuaValue[] {a_arg_1_,a,arg$1.get(ONE),arg$1.get(_2),},arg$1.get(_3)));
                  env.get(print).call(a$1,a);
                  return NONE;
               }
            });
            env.set(t,new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue a = $arg.arg1();
                  $arg = $arg.subargs(2);
                  final LuaValue arg = NIL;
                  final LuaValue arg$1 = LuaValue.listOf(new LuaValue[]{_1,_2$1,_3$1,});
                  env.get(print).invoke(varargsOf(new LuaValue[] {a_arg_1_,a,arg$1.get(ONE),arg$1.get(_2),},arg$1.get(_3)));
                  env.get(print).call(a$1,a);
                  env.get(print).invoke(varargsOf(___,$arg));
                  env.get(print).call(____a,$arg.arg1(),a);
                  env.get(print).invoke(varargsOf(a____,a,$arg));
                  return NONE;
               }
            });
            env.set(u,new OneArgFunction(env) {
               public LuaValue call(LuaValue arg$1) {
                  env.get(print).call(arg$2,arg$1);
                  return NONE;
               }
            });
            env.set(v,new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue arg$1 = $arg.arg1();
                  $arg = $arg.subargs(2);
                  final LuaValue arg = NIL;
                  env.get(print).call(arg$2,arg);
                  env.get(print).invoke(varargsOf(___,$arg));
                  env.get(print).invoke(varargsOf(arg____,arg,$arg));
                  return NONE;
               }
            });
            env.set(arg$2,LuaValue.listOf(new LuaValue[]{global_1,global_2,global_3,}));
            env.set(tryall,new TwoArgFunction(env) {
               public LuaValue call(LuaValue f$1,LuaValue name$1) {
                  env.get(print).call(_____fun.concat(name$1.concat(__.buffer())).value());
                  env.get(print).call(__$1.concat(name$1.concat(___$1.buffer())).value());
                  env.get(print).invoke(varargsOf(___$2,env.get(pcall).invoke(f$1)));
                  env.get(print).call(__$1.concat(name$1.concat(__q___.buffer())).value());
                  env.get(print).invoke(varargsOf(___$2,env.get(pcall).invoke(varargsOf(f$1,q))));
                  env.get(print).call(__$1.concat(name$1.concat(__q___r_.buffer())).value());
                  env.get(print).invoke(varargsOf(___$2,env.get(pcall).invoke(varargsOf(f$1,q,r))));
                  env.get(print).call(__$1.concat(name$1.concat(__q___r_$1.buffer())).value());
                  env.get(print).invoke(varargsOf(___$2,env.get(pcall).invoke(varargsOf(new LuaValue[] {f$1,q,r,},s))));
                  return NONE;
               }
            });
            env.get(tryall).call(env.get(p),p);
            env.get(tryall).call(env.get(q),q);
            env.get(tryall).call(env.get(r),r);
            env.get(tryall).call(env.get(s),s);
            env.get(tryall).call(env.get(t),t);
            env.get(tryall).call(env.get(u),u);
            env.get(tryall).call(env.get(v),v);
            return NONE;
         }
      };
      env.get(print).invoke(varargsOf(varargst,env.get(pcall).invoke(varargstest)));
      env.get(print).call(________$2);
      final LuaValue metatabletests = new ZeroArgFunction(env) {
         public LuaValue call() {
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
            final LuaValue results = new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue s$1 = $arg.arg1();
                  final LuaValue e = $arg.arg(2);
                  $arg = $arg.subargs(3);
                  final LuaValue arg = NIL;
                  if ( s$1.toboolean() ) {
                     return varargsOf(e,$arg);
                  }
                  return varargsOf(FALSE,env.get(type$1).invoke(e));
               }
            };
            final LuaValue pcall$1 = new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue arg = NIL;
                  return new TailcallVarargs(results,env.get(pcall).invoke($arg));
               }
            };
            env.get(print).invoke(hello.invokemethod(sub$1,varargsOf(_2,_4)));
            final LuaValue[] t$1 = {LuaValue.tableOf()};
            env.set(op,new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue name$1 = $arg.arg1();
                  $arg = $arg.subargs(2);
                  final LuaValue arg = NIL;
                  final Varargs t$2 = pcall$1.invoke(varargsOf(env.get(setmetat),t$1[0],$arg));
                  final LuaValue a = t$2.arg1();
                  final LuaValue b = t$2.arg(2);
                  env.get(print).invoke(varargsOf(new LuaValue[] {name$1,t$1[0],env.get(getmetat).call(t$1[0]),a,},b));
                  return NONE;
               }
            });
            env.get(op).call(set____,LuaValue.tableOf());
            env.get(op).call(set_nil,NIL);
            env.get(op).call(set____,LuaValue.tableOf());
            env.get(op).call(set$1);
            env.get(op).call(set____,LuaValue.tableOf());
            env.get(op).call(set____,LuaValue.tableOf());
            env.get(op).call(set____$1,LuaValue.tableOf(),LuaValue.tableOf());
            env.get(op).call(set_nil,NIL);
            env.get(op).call(set____$2,LuaValue.tableOf(new LuaValue[]{__metata,LuaValue.tableOf(),}));
            env.get(op).call(set____,LuaValue.tableOf());
            env.get(op).call(set_nil,NIL);
            t$1[0] = LuaValue.tableOf();
            env.get(op).call(set____,LuaValue.tableOf());
            env.get(op).call(set_nil,NIL);
            env.get(op).call(set____$2,LuaValue.tableOf(new LuaValue[]{__metata,abc,}));
            env.get(op).call(set____,LuaValue.tableOf());
            env.get(op).call(set_nil,NIL);
            final LuaValue[] i = {_1234};
            final LuaValue t$2 = env.get(setmetat).call(LuaValue.tableOf(),LuaValue.tableOf(new LuaValue[]{__mode,v,__index,new TwoArgFunction(env) {
               public LuaValue call(LuaValue t$2,LuaValue k) {
                  final LuaValue v$1 = i[0];
                  i[0] = valueOf(i[0].checkdouble()+1);
                  env.get(rawset$1).call(t$2,k,v$1);
                  return v$1;
               }
            },}));
            final LuaValue l = LuaValue.listOf(new LuaValue[]{a$1,b,a$1,b,c,a$1,b,c,d,});
            LuaValue f$1,s$1,var;
            Varargs v$1;
            final Varargs v$2 = env.get(ipairs).invoke(l);
            f$1 = v$2.arg1();
            s$1 = v$2.arg(2);
            var = v$2.arg(3);
            while (true) {
               v$1 = f$1.invoke(varargsOf(s$1,var));
               if ((var=v$1.arg1()).isnil()) break;
               final LuaValue i$1 = var;
               final LuaValue key = v$1.arg(2);
               env.get(print).call(t_.concat(key),t$2.get(key));
            }
            return NONE;
         }
      };
      env.get(print).invoke(varargsOf(metatabl,env.get(pcall).invoke(metatabletests)));
      env.get(print).call(________$3);
      final LuaValue hugetables = new ZeroArgFunction(env) {
         public LuaValue call() {
            final LuaValue t$1 = LuaValue.listOf(new LuaValue[]{ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,ONE,});
            env.get(print).invoke(varargsOf(new LuaValue[] {_t_,t$1.len(),t_1_50_5,t$1.get(ONE),t$1.get(_50),t$1.get(_51),},t$1.get(_59)));
            env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(t$1,_$1)));
            final LuaValue t2 = LuaValue.listOf(new LuaValue[]{ZERO,_3,_4,_7,_9,_8,_12,_15,_23,_5,_10,_13,_14,_17,_19,_18,_112,_115,_123,_15,_20,_33,_24,_27,_29,_28,_212,_215,_223,_25,_40,_43,_44,_47,_49,_48,_412,_415,_423,_45,_50,_53,_54,_57,_59,_58,_512,_515,_523,_55,_60,_63,_64,_67,_69,_68,_612,_615,_623,_65,_70,_73,_74,_77,_79,_78,_72,_715,_723,_75,});
            env.get(print).invoke(varargsOf(new LuaValue[] {_t2_,t2.len(),t_1_50_5,t$1.get(ONE),t$1.get(_50),t$1.get(_51),},t$1.get(_59)));
            env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(t2,_$1)));
            final LuaValue t$2 = LuaValue.tableOf(new LuaValue[]{_2000,a$1,_2001,b,_2002,c,_2003,d,_2004,e,_2005,f,_2006,g,_2007,h,_2008,i,_2009,j,_3000,a$1,_3001,b,_3002,c,_3003,d,_3004,e,_3005,f,_3006,g,_3007,h,_3008,i,_3009,j,_4000,a$1,_4001,b,_4002,c,_4003,d,_4004,e,_4005,f,_4006,g,_4007,h,_4008,i,_4009,j,_5000,a$1,_5001,b,_5002,c,_5003,d,_5004,e,_5005,f,_5006,g,_5007,h,_5008,i,_5009,j,_6000,a$1,_6001,b,_6002,c,_6003,d,_6004,e,_6005,f,_6006,g,_6007,h,_6008,i,_6009,j,_7000,a$1,_7001,b,_7002,c,_7003,d,_7004,e,_7005,f,_7006,g,_7007,h,_7008,i,_7009,j,_8000,a$1,_8001,b,_8002,c,_8003,d,_8004,e,_8005,f,_8006,g,_8007,h,_8008,i,_8009,j,});
            for ( double i$1$0=_2000.checkdouble(), i$1$limit=_8000.checkdouble(), i$1$step=_1000.checkdouble(); i$1$step>0? (i$1$0<=i$1$limit): (i$1$0>=i$1$limit); i$1$0+=i$1$step ) {
               final LuaValue i$1 = valueOf(i$1$0);
               for ( double j$1$0=ZERO.checkdouble(), j$1$limit=_9.checkdouble(), j$1$step=ONE.checkdouble(); j$1$step>0? (j$1$0<=j$1$limit): (j$1$0>=j$1$limit); j$1$0+=j$1$step ) {
                  final LuaValue j$1 = valueOf(j$1$0);
                  env.get(print).call(t_$1.concat(env.get(tostring$1).call(valueOf(i$1.checkdouble()+j$1.checkdouble())).concat(_$2.buffer())).value(),t$2.get(valueOf(i$1.checkdouble()+j$1.checkdouble())));
               }
            }
            return NONE;
         }
      };
      env.get(print).invoke(varargsOf(hugetabl,env.get(pcall).invoke(hugetables)));
      env.get(print).call(________$4);
      final LuaValue manylocals = new ZeroArgFunction(env) {
         public LuaValue call() {
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            env.get(print).call(a$1,a$1);
            env.get(print).call(b,b);
            env.get(print).call(c,c);
            env.get(print).call(d,d);
            env.get(print).call(e,e);
            env.get(print).call(f,f);
            env.get(print).call(g,g);
            env.get(print).call(h,h);
            env.get(print).call(i,i);
            env.get(print).call(j,j);
            return NONE;
         }
      };
      env.get(print).invoke(varargsOf(manyloca,env.get(pcall).invoke(manylocals)));
      return NONE;
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue ________ = valueOf("-------- basic vm tests --------");
   static final LuaValue ___boole = valueOf("-- boolean tests");
   static final LuaValue t = valueOf("t");
   static final LuaValue f = valueOf("f");
   static final LuaValue n = valueOf("n");
   static final LuaValue Hello = valueOf("Hello");
   static final LuaValue s = valueOf("s");
   static final LuaValue z = valueOf("z");
   static final LuaValue one = valueOf("one");
   static final LuaValue booleant = valueOf("booleantests result:");
   static final LuaValue pcall = valueOf("pcall");
   static final LuaValue ________$1 = valueOf("------------- varargs");
   static final LuaValue a$1 = valueOf("a");
   static final LuaValue ___ = valueOf("...");
   static final LuaValue ____a = valueOf("...,a");
   static final LuaValue a____ = valueOf("a,...");
   static final LuaValue p = valueOf("p");
   static final LuaValue a_arg_1_ = valueOf("a,arg[1],arg[2],arg[3]");
   static final LuaValue _2 = valueOf(2);
   static final LuaValue _3 = valueOf(3);
   static final LuaValue q = valueOf("q");
   static final LuaValue a_arg = valueOf("a,arg");
   static final LuaValue r = valueOf("r");
   static final LuaValue _1 = valueOf("1");
   static final LuaValue _2$1 = valueOf("2");
   static final LuaValue _3$1 = valueOf("3");
   static final LuaValue arg$2 = valueOf("arg");
   static final LuaValue u = valueOf("u");
   static final LuaValue arg____ = valueOf("arg,...");
   static final LuaValue v = valueOf("v");
   static final LuaValue global_1 = valueOf("global-1");
   static final LuaValue global_2 = valueOf("global-2");
   static final LuaValue global_3 = valueOf("global-3");
   static final LuaValue _____fun = valueOf("---- function ");
   static final LuaValue __ = valueOf("()");
   static final LuaValue __$1 = valueOf("--");
   static final LuaValue ___$1 = valueOf("():");
   static final LuaValue ___$2 = valueOf(" ->");
   static final LuaValue __q___ = valueOf("(\"q\"):");
   static final LuaValue __q___r_ = valueOf("(\"q\",\"r\"):");
   static final LuaValue __q___r_$1 = valueOf("(\"q\",\"r\",\"s\"):");
   static final LuaValue tryall = valueOf("tryall");
   static final LuaValue varargst = valueOf("varargstest result:");
   static final LuaValue ________$2 = valueOf("---------- metatable tests");
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
   static final LuaValue hello = valueOf("hello");
   static final LuaValue sub$1 = valueOf("sub");
   static final LuaValue _4 = valueOf(4);
   static final LuaValue setmetat = valueOf("setmetatable");
   static final LuaValue getmetat = valueOf("getmetatable");
   static final LuaValue op = valueOf("op");
   static final LuaValue set____ = valueOf("set{}  ");
   static final LuaValue set_nil = valueOf("set-nil");
   static final LuaValue set$1 = valueOf("set");
   static final LuaValue set____$1 = valueOf("set{}{}");
   static final LuaValue set____$2 = valueOf("set{__}");
   static final LuaValue __metata = valueOf("__metatable");
   static final LuaValue abc = valueOf("abc");
   static final LuaValue _1234 = valueOf(1234);
   static final LuaValue __mode = valueOf("__mode");
   static final LuaValue __index = valueOf("__index");
   static final LuaValue rawset$1 = valueOf("rawset");
   static final LuaValue b = valueOf("b");
   static final LuaValue c = valueOf("c");
   static final LuaValue d = valueOf("d");
   static final LuaValue ipairs = valueOf("ipairs");
   static final LuaValue t_ = valueOf("t.");
   static final LuaValue metatabl = valueOf("metatabletests result:");
   static final LuaValue ________$3 = valueOf("------------ huge tables");
   static final LuaValue _t_ = valueOf("#t=");
   static final LuaValue t_1_50_5 = valueOf("t[1,50,51,59]");
   static final LuaValue _50 = valueOf(50);
   static final LuaValue _51 = valueOf(51);
   static final LuaValue _59 = valueOf(59);
   static final LuaValue concat$1 = valueOf("concat");
   static final LuaValue _$1 = valueOf(",");
   static final LuaValue _7 = valueOf(7);
   static final LuaValue _9 = valueOf(9);
   static final LuaValue _8 = valueOf(8);
   static final LuaValue _12 = valueOf(12);
   static final LuaValue _15 = valueOf(15);
   static final LuaValue _23 = valueOf(23);
   static final LuaValue _5 = valueOf(5);
   static final LuaValue _10 = valueOf(10);
   static final LuaValue _13 = valueOf(13);
   static final LuaValue _14 = valueOf(14);
   static final LuaValue _17 = valueOf(17);
   static final LuaValue _19 = valueOf(19);
   static final LuaValue _18 = valueOf(18);
   static final LuaValue _112 = valueOf(112);
   static final LuaValue _115 = valueOf(115);
   static final LuaValue _123 = valueOf(123);
   static final LuaValue _20 = valueOf(20);
   static final LuaValue _33 = valueOf(33);
   static final LuaValue _24 = valueOf(24);
   static final LuaValue _27 = valueOf(27);
   static final LuaValue _29 = valueOf(29);
   static final LuaValue _28 = valueOf(28);
   static final LuaValue _212 = valueOf(212);
   static final LuaValue _215 = valueOf(215);
   static final LuaValue _223 = valueOf(223);
   static final LuaValue _25 = valueOf(25);
   static final LuaValue _40 = valueOf(40);
   static final LuaValue _43 = valueOf(43);
   static final LuaValue _44 = valueOf(44);
   static final LuaValue _47 = valueOf(47);
   static final LuaValue _49 = valueOf(49);
   static final LuaValue _48 = valueOf(48);
   static final LuaValue _412 = valueOf(412);
   static final LuaValue _415 = valueOf(415);
   static final LuaValue _423 = valueOf(423);
   static final LuaValue _45 = valueOf(45);
   static final LuaValue _53 = valueOf(53);
   static final LuaValue _54 = valueOf(54);
   static final LuaValue _57 = valueOf(57);
   static final LuaValue _58 = valueOf(58);
   static final LuaValue _512 = valueOf(512);
   static final LuaValue _515 = valueOf(515);
   static final LuaValue _523 = valueOf(523);
   static final LuaValue _55 = valueOf(55);
   static final LuaValue _60 = valueOf(60);
   static final LuaValue _63 = valueOf(63);
   static final LuaValue _64 = valueOf(64);
   static final LuaValue _67 = valueOf(67);
   static final LuaValue _69 = valueOf(69);
   static final LuaValue _68 = valueOf(68);
   static final LuaValue _612 = valueOf(612);
   static final LuaValue _615 = valueOf(615);
   static final LuaValue _623 = valueOf(623);
   static final LuaValue _65 = valueOf(65);
   static final LuaValue _70 = valueOf(70);
   static final LuaValue _73 = valueOf(73);
   static final LuaValue _74 = valueOf(74);
   static final LuaValue _77 = valueOf(77);
   static final LuaValue _79 = valueOf(79);
   static final LuaValue _78 = valueOf(78);
   static final LuaValue _72 = valueOf(72);
   static final LuaValue _715 = valueOf(715);
   static final LuaValue _723 = valueOf(723);
   static final LuaValue _75 = valueOf(75);
   static final LuaValue _t2_ = valueOf("#t2=");
   static final LuaValue _2000 = valueOf(2000);
   static final LuaValue _2001 = valueOf(2001);
   static final LuaValue _2002 = valueOf(2002);
   static final LuaValue _2003 = valueOf(2003);
   static final LuaValue _2004 = valueOf(2004);
   static final LuaValue e = valueOf("e");
   static final LuaValue _2005 = valueOf(2005);
   static final LuaValue _2006 = valueOf(2006);
   static final LuaValue g = valueOf("g");
   static final LuaValue _2007 = valueOf(2007);
   static final LuaValue h = valueOf("h");
   static final LuaValue _2008 = valueOf(2008);
   static final LuaValue i = valueOf("i");
   static final LuaValue _2009 = valueOf(2009);
   static final LuaValue j = valueOf("j");
   static final LuaValue _3000 = valueOf(3000);
   static final LuaValue _3001 = valueOf(3001);
   static final LuaValue _3002 = valueOf(3002);
   static final LuaValue _3003 = valueOf(3003);
   static final LuaValue _3004 = valueOf(3004);
   static final LuaValue _3005 = valueOf(3005);
   static final LuaValue _3006 = valueOf(3006);
   static final LuaValue _3007 = valueOf(3007);
   static final LuaValue _3008 = valueOf(3008);
   static final LuaValue _3009 = valueOf(3009);
   static final LuaValue _4000 = valueOf(4000);
   static final LuaValue _4001 = valueOf(4001);
   static final LuaValue _4002 = valueOf(4002);
   static final LuaValue _4003 = valueOf(4003);
   static final LuaValue _4004 = valueOf(4004);
   static final LuaValue _4005 = valueOf(4005);
   static final LuaValue _4006 = valueOf(4006);
   static final LuaValue _4007 = valueOf(4007);
   static final LuaValue _4008 = valueOf(4008);
   static final LuaValue _4009 = valueOf(4009);
   static final LuaValue _5000 = valueOf(5000);
   static final LuaValue _5001 = valueOf(5001);
   static final LuaValue _5002 = valueOf(5002);
   static final LuaValue _5003 = valueOf(5003);
   static final LuaValue _5004 = valueOf(5004);
   static final LuaValue _5005 = valueOf(5005);
   static final LuaValue _5006 = valueOf(5006);
   static final LuaValue _5007 = valueOf(5007);
   static final LuaValue _5008 = valueOf(5008);
   static final LuaValue _5009 = valueOf(5009);
   static final LuaValue _6000 = valueOf(6000);
   static final LuaValue _6001 = valueOf(6001);
   static final LuaValue _6002 = valueOf(6002);
   static final LuaValue _6003 = valueOf(6003);
   static final LuaValue _6004 = valueOf(6004);
   static final LuaValue _6005 = valueOf(6005);
   static final LuaValue _6006 = valueOf(6006);
   static final LuaValue _6007 = valueOf(6007);
   static final LuaValue _6008 = valueOf(6008);
   static final LuaValue _6009 = valueOf(6009);
   static final LuaValue _7000 = valueOf(7000);
   static final LuaValue _7001 = valueOf(7001);
   static final LuaValue _7002 = valueOf(7002);
   static final LuaValue _7003 = valueOf(7003);
   static final LuaValue _7004 = valueOf(7004);
   static final LuaValue _7005 = valueOf(7005);
   static final LuaValue _7006 = valueOf(7006);
   static final LuaValue _7007 = valueOf(7007);
   static final LuaValue _7008 = valueOf(7008);
   static final LuaValue _7009 = valueOf(7009);
   static final LuaValue _8000 = valueOf(8000);
   static final LuaValue _8001 = valueOf(8001);
   static final LuaValue _8002 = valueOf(8002);
   static final LuaValue _8003 = valueOf(8003);
   static final LuaValue _8004 = valueOf(8004);
   static final LuaValue _8005 = valueOf(8005);
   static final LuaValue _8006 = valueOf(8006);
   static final LuaValue _8007 = valueOf(8007);
   static final LuaValue _8008 = valueOf(8008);
   static final LuaValue _8009 = valueOf(8009);
   static final LuaValue _1000 = valueOf(1000);
   static final LuaValue t_$1 = valueOf("t[");
   static final LuaValue _$2 = valueOf("]");
   static final LuaValue hugetabl = valueOf("hugetables result:");
   static final LuaValue ________$4 = valueOf("--------- many locals");
   static final LuaValue manyloca = valueOf("manylocals result:");
}