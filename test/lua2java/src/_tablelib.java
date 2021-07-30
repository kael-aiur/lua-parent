import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _tablelib extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue $b;
      final LuaValue func = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue t = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            return $arg.arg1();
         }
      };
      final LuaValue tbl = env.get(setmetat).call(LuaValue.tableOf(),LuaValue.tableOf(new LuaValue[]{__index,func,}));
      env.get(print).call(tbl.get(_2));
      final LuaValue ts = env.get(tostring$1);
      final LuaValue id = LuaValue.tableOf();
      final LuaValue[] nid = {ZERO};
      final LuaValue types = LuaValue.tableOf(new LuaValue[]{table,tbl$1,thread,thr,userdata,uda,function,func$1,});
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
      final LuaValue t = LuaValue.tableOf(new LuaValue[]{a,aaa,b,bbb,c,ccc,},new LuaValue[]{one,two,three,});
      env.get(table).get(insert).call(t,six);
      env.get(table).get(insert).call(t,ONE,seven);
      env.get(table).get(insert).call(t,_4,eight);
      env.get(table).get(insert).call(t,_7,nine);
      env.get(table).get(insert).call(t,_10,ten);
      env.get(print).call(t.len());
      env.get(print).call(___conca);
      env.set(tryconca,new OneArgFunction(env) {
         public LuaValue call(LuaValue t$1) {
            env.get(print).invoke(env.get(table).get(concat$1).invoke(t$1));
            env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(t$1,__)));
            env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(t$1,_$1,_2)));
            env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(new LuaValue[] {t$1,_$1,_2,},_2)));
            env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(new LuaValue[] {t$1,_$1,_5,},_2)));
            return NONE;
         }
      });
      env.get(tryconca).call(LuaValue.tableOf(new LuaValue[]{a,aaa,b,bbb,c,ccc,},new LuaValue[]{one,two,three,}));
      env.get(tryconca).call(LuaValue.listOf(new LuaValue[]{one,two,three,four,five,}));
      env.set(tryconca,new OneArgFunction(env) {
         public LuaValue call(LuaValue t$1) {
            env.get(print).invoke(env.get(table).get(concat$1).invoke(t$1));
            env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(t$1,__)));
            env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(t$1,_$1,_2)));
            return NONE;
         }
      });
      env.get(tryconca).call(LuaValue.tableOf(new LuaValue[]{a,aaa,b,bbb,c,ccc,d,ddd,e,eee,}));
      env.get(tryconca).call(LuaValue.tableOf(new LuaValue[]{_501,one,_502,two,_503,three,_504,four,_505,five,}));
      env.get(tryconca).call(LuaValue.tableOf());
      env.set(eles,new TwoArgFunction(env) {
         public LuaValue call(LuaValue t$1,LuaValue f) {
            LuaValue $b;
            f = (($b=f).toboolean()?$b:env.get(pairs));
            env.set(all,LuaValue.tableOf());
            LuaValue f$1,s,var;
            Varargs v;
            final Varargs v$1 = f.invoke(t$1);
            f$1 = v$1.arg1();
            s = v$1.arg(2);
            var = v$1.arg(3);
            while (true) {
               v = f$1.invoke(varargsOf(s,var));
               if ((var=v.arg1()).isnil()) break;
               final LuaValue k = var;
               final LuaValue v$2 = v.arg(2);
               env.get(table).get(insert).call(env.get(all),_$2.concat(env.get(tostring$1).call(k).concat(__$1.concat(env.get(tostring$1).call(v$2).buffer()))).value());
            }
            env.get(table).get(sort).call(env.get(all));
            return _$3.concat(env.get(table).get(concat$1).call(env.get(all),_$1).concat(_$4.buffer())).value();
         }
      });
      env.get(print).call(___inser);
      LuaValue t$1 = LuaValue.tableOf(new LuaValue[]{a,aaa,b,bbb,c,ccc,},new LuaValue[]{one,two,three,});
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(table).get(insert).call(t$1,six);
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(table).get(insert).call(t$1,ONE,seven);
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(table).get(insert).call(t$1,_4,eight);
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(table).get(insert).call(t$1,_7,nine);
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(table).get(insert).call(t$1,_10,ten);
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(print).call(___,LuaValue.tableOf().len());
      env.get(print).call(___a__,LuaValue.listOf(new LuaValue[]{a,}).len());
      env.get(print).call(___a___b,LuaValue.listOf(new LuaValue[]{a,b,}).len());
      env.get(print).call(___a__ni,LuaValue.listOf(new LuaValue[]{a,NIL,}).len());
      env.get(print).call(__nil_ni,LuaValue.listOf(new LuaValue[]{NIL,NIL,}).len());
      env.get(print).call(__nil__b,(($b=LuaValue.listOf(new LuaValue[]{NIL,b,}).len().eq(ZERO)).toboolean()?$b:LuaValue.listOf(new LuaValue[]{NIL,b,}).len().eq(_2)));
      env.get(print).call(___a___b$1,LuaValue.listOf(new LuaValue[]{a,b,c,}).len());
      env.get(print).call(___a___b$2,LuaValue.listOf(new LuaValue[]{a,b,NIL,}).len());
      env.get(print).call(___a__ni$1,LuaValue.listOf(new LuaValue[]{a,NIL,NIL,}).len());
      env.get(print).call(__nil_ni$1,LuaValue.listOf(new LuaValue[]{NIL,NIL,NIL,}).len());
      env.get(print).call(__nil_ni$2,(($b=LuaValue.listOf(new LuaValue[]{NIL,NIL,c,}).len().eq(ZERO)).toboolean()?$b:LuaValue.listOf(new LuaValue[]{NIL,NIL,c,}).len().eq(_3)));
      env.get(print).call(__nil__b$1,(($b=LuaValue.listOf(new LuaValue[]{NIL,b,c,}).len().eq(ZERO)).toboolean()?$b:LuaValue.listOf(new LuaValue[]{NIL,b,c,}).len().eq(_3)));
      env.get(print).call(__nil__b$2,(($b=LuaValue.listOf(new LuaValue[]{NIL,b,NIL,}).len().eq(ZERO)).toboolean()?$b:LuaValue.listOf(new LuaValue[]{NIL,b,NIL,}).len().eq(_2)));
      env.get(print).call(___a__ni$2,(($b=LuaValue.listOf(new LuaValue[]{a,NIL,c,}).len().eq(ONE)).toboolean()?$b:LuaValue.listOf(new LuaValue[]{a,NIL,c,}).len().eq(_3)));
      env.get(print).call(___remov);
      t$1 = LuaValue.tableOf(new LuaValue[]{_10,ten,a,aaa,b,bbb,c,ccc,},new LuaValue[]{one,two,three,four,five,six,seven,});
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(print).invoke(varargsOf(table_re,env.get(table).get(remove).invoke(t$1)));
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(print).invoke(varargsOf(table_re$1,env.get(table).get(remove).invoke(varargsOf(t$1,ONE))));
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(print).invoke(varargsOf(table_re$2,env.get(table).get(remove).invoke(varargsOf(t$1,_3))));
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(print).invoke(varargsOf(table_re$3,env.get(table).get(remove).invoke(varargsOf(t$1,_5))));
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(print).invoke(varargsOf(table_re$4,env.get(table).get(remove).invoke(varargsOf(t$1,_10))));
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(print).invoke(varargsOf(table_re$5,env.get(table).get(remove).invoke(varargsOf(t$1,ONE.neg()))));
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(print).invoke(varargsOf(table_re$5,env.get(table).get(remove).invoke(varargsOf(t$1,ONE.neg()))));
      env.get(print).call(env.get(eles).call(t$1),t$1.len());
      env.get(print).call(___sort_);
      env.set(sorttest,new TwoArgFunction(env) {
         public LuaValue call(LuaValue t$2,LuaValue f) {
            t$2 = t$2;
            env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(t$2,_$5)));
            if ( f.toboolean() ) {
               env.get(table).get(sort).call(t$2,f);
            } else {
               env.get(table).get(sort).call(t$2);
            }
            env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(t$2,_$5)));
            return NONE;
         }
      });
      env.get(sorttest).call(LuaValue.listOf(new LuaValue[]{one,two,three,}));
      env.get(sorttest).call(LuaValue.listOf(new LuaValue[]{www,vvv,uuu,ttt,sss,zzz,yyy,xxx,}));
      env.get(sorttest).call(LuaValue.listOf(new LuaValue[]{www,vvv,uuu,ttt,sss,zzz,yyy,xxx,}),new TwoArgFunction(env) {
         public LuaValue call(LuaValue a$1,LuaValue b$1) {
            return b$1.lt(a$1);
         }
      });
      env.set(t0,LuaValue.tableOf());
      env.set(t1,LuaValue.listOf(new LuaValue[]{one,two,three,}));
      env.set(t2,LuaValue.tableOf(new LuaValue[]{a1,aa,a2,bb,a3,cc,}));
      env.set(t3,LuaValue.tableOf(new LuaValue[]{a1,aa,a2,bb,a3,cc,},new LuaValue[]{one,two,three,}));
      env.get(print).invoke(varargsOf(getn_.concat(env.get(eles).call(env.get(t0)).concat(_$6.buffer())).value(),env.get(pcall).invoke(varargsOf(env.get(table).get(getn$1),env.get(t0)))));
      env.get(print).invoke(varargsOf(getn_.concat(env.get(eles).call(env.get(t1)).concat(_$6.buffer())).value(),env.get(pcall).invoke(varargsOf(env.get(table).get(getn$1),env.get(t1)))));
      env.get(print).invoke(varargsOf(getn_.concat(env.get(eles).call(env.get(t2)).concat(_$6.buffer())).value(),env.get(pcall).invoke(varargsOf(env.get(table).get(getn$1),env.get(t2)))));
      env.get(print).invoke(varargsOf(getn_.concat(env.get(eles).call(env.get(t3)).concat(_$6.buffer())).value(),env.get(pcall).invoke(varargsOf(env.get(table).get(getn$1),env.get(t3)))));
      env.set(test,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue f = $arg.arg1();
            final LuaValue t$2 = $arg.arg(2);
            final LuaValue result = $arg.arg(3);
            final LuaValue name$1 = $arg.arg(4);
            final Varargs v = env.get(pcall).invoke(varargsOf(f,t$2,new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue arg = NIL;
                  env.get(print).invoke(varargsOf(_____,$arg));
                  env.get(print).invoke(varargsOf(__next,env.get(next$1).invoke(varargsOf(t$2,$arg.arg1()))));
                  return result;
               }
            }));
            env.set(status,v.arg1());
            env.set(value,v.arg(2));
            env.get(print).invoke(varargsOf(new LuaValue[] {name$1,s_v,env.get(status),},env.get(value)));
            return NONE;
         }
      });
      env.set(testall,new ThreeArgFunction(env) {
         public LuaValue call(LuaValue f,LuaValue t$2,LuaValue name$1) {
            env.get(test).invoke(varargsOf(new LuaValue[] {f,t$2,NIL,},name$1.concat(nil)));
            env.get(test).invoke(varargsOf(new LuaValue[] {f,t$2,FALSE,},name$1.concat(fls)));
            env.get(test).invoke(varargsOf(new LuaValue[] {f,t$2,_100,},name$1.concat(_100$1)));
            return NONE;
         }
      });
      env.get(testall).call(env.get(table).get(foreach),env.get(t0),table_fo.concat(env.get(eles).call(env.get(t0)).concat(_$6.buffer())).value());
      env.get(testall).call(env.get(table).get(foreach),env.get(t1),table_fo.concat(env.get(eles).call(env.get(t1)).concat(_$6.buffer())).value());
      env.get(testall).call(env.get(table).get(foreach),env.get(t2),table_fo.concat(env.get(eles).call(env.get(t2)).concat(_$6.buffer())).value());
      env.get(testall).call(env.get(table).get(foreach),env.get(t3),table_fo.concat(env.get(eles).call(env.get(t3)).concat(_$6.buffer())).value());
      env.get(testall).call(env.get(table).get(foreachi),env.get(t0),table_fo$1.concat(env.get(eles).call(env.get(t0)).concat(_$6.buffer())).value());
      env.get(testall).call(env.get(table).get(foreachi),env.get(t1),table_fo$1.concat(env.get(eles).call(env.get(t1)).concat(_$6.buffer())).value());
      env.get(testall).call(env.get(table).get(foreachi),env.get(t2),table_fo$1.concat(env.get(eles).call(env.get(t2)).concat(_$6.buffer())).value());
      env.get(testall).call(env.get(table).get(foreachi),env.get(t3),table_fo$1.concat(env.get(eles).call(env.get(t3)).concat(_$6.buffer())).value());
      env.get(print).call(______un);
      final LuaValue a$1 = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            return $arg;
         }
      };
      env.get(print).invoke(varargsOf(unpack__,env.get(unpack).invoke(LuaValue.tableOf())));
      env.get(print).invoke(varargsOf(unpack_a,env.get(unpack).invoke(LuaValue.listOf(new LuaValue[]{a,}))));
      env.get(print).invoke(varargsOf(unpack__$1,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{NIL,}),ONE,ONE))));
      env.get(print).invoke(varargsOf(unpack_a$1,env.get(unpack).invoke(LuaValue.listOf(new LuaValue[]{a,b,}))));
      env.get(print).invoke(varargsOf(unpack__$2,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{NIL,b,}),ONE,_2))));
      env.get(print).invoke(varargsOf(unpack_a$2,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{a,NIL,}),ONE,_2))));
      env.get(print).invoke(varargsOf(unpack_a$3,env.get(unpack).invoke(LuaValue.listOf(new LuaValue[]{a,b,c,}))));
      env.get(print).invoke(varargsOf(unpack__$3,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{NIL,a,b,}),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack_a$4,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{a,NIL,b,}),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack_a$5,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{a,b,NIL,}),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack__$4,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{NIL,NIL,b,}),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack_a$6,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{a,NIL,NIL,}),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack__$5,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{NIL,b,NIL,}),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack__$6,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{NIL,NIL,NIL,}),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack__$7,env.get(unpack).invoke(LuaValue.listOf(new LuaValue[]{}, a$1.invoke()))));
      env.get(print).invoke(varargsOf(unpack__$8,env.get(unpack).invoke(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(a)))));
      env.get(print).invoke(varargsOf(unpack__$9,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(NIL)),ONE,ONE))));
      env.get(print).invoke(varargsOf(unpack__$10,env.get(unpack).invoke(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(varargsOf(a,b))))));
      env.get(print).invoke(varargsOf(unpack__$11,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(varargsOf(NIL,b))),ONE,_2))));
      env.get(print).invoke(varargsOf(unpack__$12,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(varargsOf(a,NIL))),ONE,_2))));
      env.get(print).invoke(varargsOf(unpack__$13,env.get(unpack).invoke(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(varargsOf(a,b,c))))));
      env.get(print).invoke(varargsOf(unpack__$14,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(varargsOf(NIL,a,b))),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack__$15,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(varargsOf(a,NIL,b))),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack__$16,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(varargsOf(a,b,NIL))),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack__$17,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(varargsOf(NIL,NIL,b))),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack__$18,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(varargsOf(a,NIL,NIL))),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack__$19,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(varargsOf(NIL,b,NIL))),ONE,_3))));
      env.get(print).invoke(varargsOf(unpack__$20,env.get(unpack).invoke(varargsOf(LuaValue.listOf(new LuaValue[]{}, a$1.invoke(varargsOf(NIL,NIL,NIL))),ONE,_3))));
      env.get(print).call(______mi);
      env.get(print).call(LuaValue.listOf(new LuaValue[]{abc,def,ghi,NIL,}).len());
      env.get(print).call(LuaValue.listOf(new LuaValue[]{abc,def,ghi,FALSE,}).len());
      env.get(print).call(LuaValue.listOf(new LuaValue[]{abc,def,ghi,ZERO,}).len());
      env.get(print).call(______ba);
      final LuaValue dummyfunc = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue t$2 = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            env.get(print).invoke(varargsOf(metatabl,env.get(type$1).call(t$2),$arg));
            return dummy;
         }
      };
      final LuaValue makeloud = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue t$2 = $arg.arg1();
            return new TailcallVarargs(env.get(setmetat),varargsOf(t$2,LuaValue.tableOf(new LuaValue[]{__index,new VarArgFunction(env) {
               public Varargs invoke(Varargs $arg) {
                  final LuaValue t$3 = $arg.arg1();
                  final LuaValue k = $arg.arg(2);
                  env.get(print).call(__index,env.get(type$1).call(t$3),k);
                  return new TailcallVarargs(env.get(rawset$1),varargsOf(t$3,k));
               }
            },__newind,new ThreeArgFunction(env) {
               public LuaValue call(LuaValue t$3,LuaValue k,LuaValue v) {
                  env.get(print).invoke(varargsOf(new LuaValue[] {__newind,env.get(type$1).call(t$3),k,},v));
                  env.get(rawset$1).call(t$3,k,v);
                  return NONE;
               }
            },})));
         }
      };
      final LuaValue tests = LuaValue.listOf(new LuaValue[]{LuaValue.listOf(new LuaValue[]{basic_ta,LuaValue.tableOf(),}),LuaValue.listOf(new LuaValue[]{function$1,}, env.get(setmetat).invoke(varargsOf(LuaValue.tableOf(),LuaValue.tableOf(new LuaValue[]{__index,dummyfunc,})))),LuaValue.listOf(new LuaValue[]{function$2,}, env.get(setmetat).invoke(varargsOf(LuaValue.tableOf(),LuaValue.tableOf(new LuaValue[]{__newind,dummyfunc,})))),LuaValue.listOf(new LuaValue[]{plain_me,}, env.get(setmetat).invoke(varargsOf(LuaValue.tableOf(),makeloud.invoke(LuaValue.tableOf())))),LuaValue.listOf(new LuaValue[]{plain_me$1,}, env.get(setmetat).invoke(varargsOf(LuaValue.tableOf(),makeloud.invoke(LuaValue.tableOf())))),});
      final LuaValue shoulderr = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue s = $arg.arg1();
            final LuaValue e$1 = $arg.arg(2);
            return varargsOf(s,env.get(type$1).invoke(e$1));
         }
      };
      LuaValue f,s,var;
      Varargs v;
      final Varargs v$1 = env.get(ipairs).invoke(tests);
      f = v$1.arg1();
      s = v$1.arg(2);
      var = v$1.arg(3);
      while (true) {
         v = f.invoke(varargsOf(s,var));
         if ((var=v.arg1()).isnil()) break;
         final LuaValue i = var;
         final LuaValue test$1 = v.arg(2);
         final LuaValue testname = test$1.get(ONE);
         final LuaValue testtable = test$1.get(_2);
         env.get(print).call(_______b.concat(testname.concat(_$7.concat(env.get(type$1).call(testtable).buffer()))).value());
         env.get(print).invoke(varargsOf(t_1__2,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               testtable.set(ONE,_2);
               return NONE;
            }
         })));
         env.get(print).invoke(varargsOf(t_1_,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return testtable.get(ONE);
            }
         })));
         env.get(print).invoke(varargsOf(t_1__nil,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               testtable.set(ONE,NIL);
               return NONE;
            }
         })));
         env.get(print).invoke(varargsOf(t_1_,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return testtable.get(ONE);
            }
         })));
         env.get(print).invoke(varargsOf(t__a____,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               testtable.set(a,b);
               return NONE;
            }
         })));
         env.get(print).invoke(varargsOf(t__a___t,env.get(pcall).invoke(new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return varargsOf(testtable.get(a),testtable.get(a));
            }
         })));
         env.get(print).invoke(varargsOf(t_a__c_,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               testtable.set(a,c);
               return NONE;
            }
         })));
         env.get(print).invoke(varargsOf(t__a___t,env.get(pcall).invoke(new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return varargsOf(testtable.get(a),testtable.get(a));
            }
         })));
         env.get(print).invoke(varargsOf(t_a_nil,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               testtable.set(a,NIL);
               return NONE;
            }
         })));
         env.get(print).invoke(varargsOf(t__a___t,env.get(pcall).invoke(new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return varargsOf(testtable.get(a),testtable.get(a));
            }
         })));
         env.get(print).invoke(varargsOf(t_nil___,shoulderr.invoke(env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               testtable.set(NIL,d);
               return NONE;
            }
         }))));
         env.get(print).invoke(varargsOf(t_nil_,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return testtable.get(NIL);
            }
         })));
         env.get(print).invoke(varargsOf(t_nil__n,shoulderr.invoke(env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               testtable.set(NIL,NIL);
               return NONE;
            }
         }))));
         env.get(print).invoke(varargsOf(t_nil_,env.get(pcall).invoke(new ZeroArgFunction(env) {
            public LuaValue call() {
               return testtable.get(NIL);
            }
         })));
      }
      env.get(print).call(___sort_);
      final LuaValue tryall = new OneArgFunction(env) {
         public LuaValue call(LuaValue cmp$0) {
            final LuaValue cmp = cmp$0;
            final LuaValue try$1 = new OneArgFunction(env) {
               public LuaValue call(LuaValue t$2) {
                  env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(t$2,_$5)));
                  if ( env.get(pcall).call(env.get(table).get(sort),t$2,cmp).toboolean() ) {
                     env.get(print).invoke(env.get(table).get(concat$1).invoke(varargsOf(t$2,_$5)));
                  } else {
                     env.get(print).call(sort_fai);
                  }
                  return NONE;
               }
            };
            try$1.call(LuaValue.listOf(new LuaValue[]{_2,_4,_6,_8,ONE,_3,_5,_7,}));
            try$1.call(LuaValue.listOf(new LuaValue[]{_333,_222,_111,}));
            try$1.call(LuaValue.listOf(new LuaValue[]{www,xxx,yyy,aaa,bbb,ccc,}));
            try$1.call(LuaValue.listOf(new LuaValue[]{_21,_23,_25,_27,_22,_24,_26,_28,}));
            return NONE;
         }
      };
      final LuaValue comparator = new TwoArgFunction(env) {
         public LuaValue call(LuaValue a$2,LuaValue b$1) {
            return env.get(tonumber$1).call(a$2).lt(env.get(tonumber$1).call(b$1));
         }
      };
      env.get(print).call(default_);
      tryall.call();
      env.get(print).call(custom__);
      tryall.call(comparator);
      return NONE;
   }
   static final LuaValue setmetat = valueOf("setmetatable");
   static final LuaValue __index = valueOf("__index");
   static final LuaValue print = valueOf("print");
   static final LuaValue _2 = valueOf(2);
   static final LuaValue tostring$1 = valueOf("tostring");
   static final LuaValue table = valueOf("table");
   static final LuaValue tbl$1 = valueOf("tbl");
   static final LuaValue thread = valueOf("thread");
   static final LuaValue thr = valueOf("thr");
   static final LuaValue userdata = valueOf("userdata");
   static final LuaValue uda = valueOf("uda");
   static final LuaValue function = valueOf("function");
   static final LuaValue func$1 = valueOf("func");
   static final LuaValue type$1 = valueOf("type");
   static final LuaValue _ = valueOf(".");
   static final LuaValue a = valueOf("a");
   static final LuaValue aaa = valueOf("aaa");
   static final LuaValue b = valueOf("b");
   static final LuaValue bbb = valueOf("bbb");
   static final LuaValue c = valueOf("c");
   static final LuaValue ccc = valueOf("ccc");
   static final LuaValue one = valueOf("one");
   static final LuaValue two = valueOf("two");
   static final LuaValue three = valueOf("three");
   static final LuaValue insert = valueOf("insert");
   static final LuaValue six = valueOf("six");
   static final LuaValue seven = valueOf("seven");
   static final LuaValue _4 = valueOf(4);
   static final LuaValue eight = valueOf("eight");
   static final LuaValue _7 = valueOf(7);
   static final LuaValue nine = valueOf("nine");
   static final LuaValue _10 = valueOf(10);
   static final LuaValue ten = valueOf("ten");
   static final LuaValue ___conca = valueOf("-- concat tests");
   static final LuaValue concat$1 = valueOf("concat");
   static final LuaValue __ = valueOf("--");
   static final LuaValue _$1 = valueOf(",");
   static final LuaValue _5 = valueOf(5);
   static final LuaValue tryconca = valueOf("tryconcat");
   static final LuaValue four = valueOf("four");
   static final LuaValue five = valueOf("five");
   static final LuaValue d = valueOf("d");
   static final LuaValue ddd = valueOf("ddd");
   static final LuaValue e = valueOf("e");
   static final LuaValue eee = valueOf("eee");
   static final LuaValue _501 = valueOf(501);
   static final LuaValue _502 = valueOf(502);
   static final LuaValue _503 = valueOf(503);
   static final LuaValue _504 = valueOf(504);
   static final LuaValue _505 = valueOf(505);
   static final LuaValue pairs = valueOf("pairs");
   static final LuaValue all = valueOf("all");
   static final LuaValue _$2 = valueOf("[");
   static final LuaValue __$1 = valueOf("]=");
   static final LuaValue sort = valueOf("sort");
   static final LuaValue _$3 = valueOf("{");
   static final LuaValue _$4 = valueOf("}");
   static final LuaValue eles = valueOf("eles");
   static final LuaValue ___inser = valueOf("-- insert, len tests");
   static final LuaValue ___ = valueOf("#{}");
   static final LuaValue ___a__ = valueOf("#{\"a\"}");
   static final LuaValue ___a___b = valueOf("#{\"a\",\"b\"}");
   static final LuaValue ___a__ni = valueOf("#{\"a\",nil}");
   static final LuaValue __nil_ni = valueOf("#{nil,nil}");
   static final LuaValue __nil__b = valueOf("#{nil,\"b\"}");
   static final LuaValue ___a___b$1 = valueOf("#{\"a\",\"b\",\"c\"}");
   static final LuaValue ___a___b$2 = valueOf("#{\"a\",\"b\",nil}");
   static final LuaValue ___a__ni$1 = valueOf("#{\"a\",nil,nil}");
   static final LuaValue __nil_ni$1 = valueOf("#{nil,nil,nil}");
   static final LuaValue __nil_ni$2 = valueOf("#{nil,nil,\"c\"}");
   static final LuaValue _3 = valueOf(3);
   static final LuaValue __nil__b$1 = valueOf("#{nil,\"b\",\"c\"}");
   static final LuaValue __nil__b$2 = valueOf("#{nil,\"b\",nil}");
   static final LuaValue ___a__ni$2 = valueOf("#{\"a\",nil,\"c\"}");
   static final LuaValue ___remov = valueOf("-- remove tests");
   static final LuaValue table_re = valueOf("table.remove(t)");
   static final LuaValue remove = valueOf("remove");
   static final LuaValue table_re$1 = valueOf("table.remove(t,1)");
   static final LuaValue table_re$2 = valueOf("table.remove(t,3)");
   static final LuaValue table_re$3 = valueOf("table.remove(t,5)");
   static final LuaValue table_re$4 = valueOf("table.remove(t,10)");
   static final LuaValue table_re$5 = valueOf("table.remove(t,-1)");
   static final LuaValue ___sort_ = valueOf("-- sort tests");
   static final LuaValue _$5 = valueOf("-");
   static final LuaValue sorttest = valueOf("sorttest");
   static final LuaValue www = valueOf("www");
   static final LuaValue vvv = valueOf("vvv");
   static final LuaValue uuu = valueOf("uuu");
   static final LuaValue ttt = valueOf("ttt");
   static final LuaValue sss = valueOf("sss");
   static final LuaValue zzz = valueOf("zzz");
   static final LuaValue yyy = valueOf("yyy");
   static final LuaValue xxx = valueOf("xxx");
   static final LuaValue t0 = valueOf("t0");
   static final LuaValue t1 = valueOf("t1");
   static final LuaValue a1 = valueOf("a1");
   static final LuaValue aa = valueOf("aa");
   static final LuaValue a2 = valueOf("a2");
   static final LuaValue bb = valueOf("bb");
   static final LuaValue a3 = valueOf("a3");
   static final LuaValue cc = valueOf("cc");
   static final LuaValue t2 = valueOf("t2");
   static final LuaValue t3 = valueOf("t3");
   static final LuaValue getn_ = valueOf("getn(");
   static final LuaValue _$6 = valueOf(")");
   static final LuaValue pcall = valueOf("pcall");
   static final LuaValue getn$1 = valueOf("getn");
   static final LuaValue _____ = valueOf("  -- ");
   static final LuaValue __next = valueOf("  next");
   static final LuaValue next$1 = valueOf("next");
   static final LuaValue status = valueOf("status");
   static final LuaValue value = valueOf("value");
   static final LuaValue s_v = valueOf("s,v");
   static final LuaValue test = valueOf("test");
   static final LuaValue nil = valueOf("nil");
   static final LuaValue fls = valueOf("fls");
   static final LuaValue _100 = valueOf(100);
   static final LuaValue _100$1 = valueOf("100");
   static final LuaValue testall = valueOf("testall");
   static final LuaValue foreach = valueOf("foreach");
   static final LuaValue table_fo = valueOf("table.foreach(");
   static final LuaValue foreachi = valueOf("foreachi");
   static final LuaValue table_fo$1 = valueOf("table.foreachi(");
   static final LuaValue ______un = valueOf("----- unpack tests -------");
   static final LuaValue unpack__ = valueOf("unpack -");
   static final LuaValue unpack = valueOf("unpack");
   static final LuaValue unpack_a = valueOf("unpack a");
   static final LuaValue unpack__$1 = valueOf("unpack .");
   static final LuaValue unpack_a$1 = valueOf("unpack ab");
   static final LuaValue unpack__$2 = valueOf("unpack .b");
   static final LuaValue unpack_a$2 = valueOf("unpack a.");
   static final LuaValue unpack_a$3 = valueOf("unpack abc");
   static final LuaValue unpack__$3 = valueOf("unpack .ab");
   static final LuaValue unpack_a$4 = valueOf("unpack a.b");
   static final LuaValue unpack_a$5 = valueOf("unpack ab.");
   static final LuaValue unpack__$4 = valueOf("unpack ..b");
   static final LuaValue unpack_a$6 = valueOf("unpack a..");
   static final LuaValue unpack__$5 = valueOf("unpack .b.");
   static final LuaValue unpack__$6 = valueOf("unpack ...");
   static final LuaValue unpack__$7 = valueOf("unpack (-)");
   static final LuaValue unpack__$8 = valueOf("unpack (a)");
   static final LuaValue unpack__$9 = valueOf("unpack (.)");
   static final LuaValue unpack__$10 = valueOf("unpack (ab)");
   static final LuaValue unpack__$11 = valueOf("unpack (.b)");
   static final LuaValue unpack__$12 = valueOf("unpack (a.)");
   static final LuaValue unpack__$13 = valueOf("unpack (abc)");
   static final LuaValue unpack__$14 = valueOf("unpack (.ab)");
   static final LuaValue unpack__$15 = valueOf("unpack (a.b)");
   static final LuaValue unpack__$16 = valueOf("unpack (ab.)");
   static final LuaValue unpack__$17 = valueOf("unpack (..b)");
   static final LuaValue unpack__$18 = valueOf("unpack (a..)");
   static final LuaValue unpack__$19 = valueOf("unpack (.b.)");
   static final LuaValue unpack__$20 = valueOf("unpack (...)");
   static final LuaValue ______mi = valueOf("----- misc table initializer tests -------");
   static final LuaValue abc = valueOf("abc");
   static final LuaValue def = valueOf("def");
   static final LuaValue ghi = valueOf("ghi");
   static final LuaValue ______ba = valueOf("----- basic table operations -------");
   static final LuaValue metatabl = valueOf("metatable call args");
   static final LuaValue dummy = valueOf("dummy");
   static final LuaValue rawset$1 = valueOf("rawset");
   static final LuaValue __newind = valueOf("__newindex");
   static final LuaValue basic_ta = valueOf("basic table");
   static final LuaValue function$1 = valueOf("function metatable on __index");
   static final LuaValue function$2 = valueOf("function metatable on __newindex");
   static final LuaValue plain_me = valueOf("plain metatable on __index");
   static final LuaValue plain_me$1 = valueOf("plain metatable on __newindex");
   static final LuaValue ipairs = valueOf("ipairs");
   static final LuaValue _______b = valueOf("------ basic table tests on ");
   static final LuaValue _$7 = valueOf(" ");
   static final LuaValue t_1__2 = valueOf("t[1]=2");
   static final LuaValue t_1_ = valueOf("t[1]");
   static final LuaValue t_1__nil = valueOf("t[1]=nil");
   static final LuaValue t__a____ = valueOf("t[\"a\"]=\"b\"");
   static final LuaValue t__a___t = valueOf("t[\"a\"],t.a");
   static final LuaValue t_a__c_ = valueOf("t.a=\"c\"");
   static final LuaValue t_a_nil = valueOf("t.a=nil");
   static final LuaValue t_nil___ = valueOf("t[nil]=\"d\"");
   static final LuaValue t_nil_ = valueOf("t[nil]");
   static final LuaValue t_nil__n = valueOf("t[nil]=nil");
   static final LuaValue sort_fai = valueOf("sort failed");
   static final LuaValue _6 = valueOf(6);
   static final LuaValue _8 = valueOf(8);
   static final LuaValue _333 = valueOf(333);
   static final LuaValue _222 = valueOf(222);
   static final LuaValue _111 = valueOf(111);
   static final LuaValue _21 = valueOf(21);
   static final LuaValue _23 = valueOf(23);
   static final LuaValue _25 = valueOf("25");
   static final LuaValue _27 = valueOf(27);
   static final LuaValue _22 = valueOf(22);
   static final LuaValue _24 = valueOf("24");
   static final LuaValue _26 = valueOf(26);
   static final LuaValue _28 = valueOf(28);
   static final LuaValue tonumber$1 = valueOf("tonumber");
   static final LuaValue default_ = valueOf("default (lexical) comparator");
   static final LuaValue custom__ = valueOf("custom (numerical) comparator");
}