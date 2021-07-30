import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _manyupvals extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue t = LuaValue.tableOf();
      t.set(ONE,__local_);
      t.set(_2,__local_$1);
      for ( double i$0=_3.checkdouble(), i$limit=_149.checkdouble(); i$0<=i$limit; ++i$0 ) {
         final LuaValue i = valueOf(i$0);
         t.set(i,__local_$2.method(gsub,________,new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               final LuaValue s = $arg.arg1();
               final LuaValue c = env.get(assert$1).call(env.get(loadstri).call(return_.concat(s)),could_no.concat(s));
               env.get(setfenv$1).call(c,LuaValue.tableOf(new LuaValue[]{i$1,i,}));
               return new TailcallVarargs(c,NONE);
            }
         }));
      }
      t.set(_150,__print_);
      final LuaValue s = env.get(table).get(concat$1).call(t);
      env.get(print).call(s);
      env.set(f,env.get(loadstri).call(s));
      env.get(f).call();
      return NONE;
   }
   static final LuaValue __local_ = valueOf("\n\tlocal f1\n\tf1 = function() return 1 end\n");
   static final LuaValue __local_$1 = valueOf("\n\tlocal f2\n\tf2 = function() return 1 end\n");
   static final LuaValue _2 = valueOf(2);
   static final LuaValue _3 = valueOf(3);
   static final LuaValue _149 = valueOf(149);
   static final LuaValue __local_$2 = valueOf("\n\tlocal f<i>\n\tdo\n\t\tlocal result\n\t\tfunction f<i>()\n\t\t\tif not result then\n\t\t\t\tresult = f<i-2>() + f<i-1>()\n\t\t\tend\n\t\t\treturn result\n\t\tend\n\tend\n");
   static final LuaValue gsub = valueOf("gsub");
   static final LuaValue ________ = valueOf("<([^>]+)>");
   static final LuaValue assert$1 = valueOf("assert");
   static final LuaValue loadstri = valueOf("loadstring");
   static final LuaValue return_ = valueOf("return ");
   static final LuaValue could_no = valueOf("could not compile: ");
   static final LuaValue setfenv$1 = valueOf("setfenv");
   static final LuaValue i$1 = valueOf("i");
   static final LuaValue __print_ = valueOf("\n\tprint(\"5th fibonacci number is\", f5())\n\tprint(\"10th fibonacci number is\", f10())\n\tprint(\"149th fibonacci number is\", f149())\n");
   static final LuaValue _150 = valueOf(150);
   static final LuaValue table = valueOf("table");
   static final LuaValue concat$1 = valueOf("concat");
   static final LuaValue print = valueOf("print");
   static final LuaValue f = valueOf("f");
}