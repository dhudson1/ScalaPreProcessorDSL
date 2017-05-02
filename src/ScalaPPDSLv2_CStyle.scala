/*
 * "C Preprocessor-like" DSL for Scala
 * 
 * Derek Hudson
 * Thomas Chenette
 * Matthew Chenette
 * 
 * CS345 - Assignment 5
 * 
 * Note: Version 2 "C-Style" - only newline if/elif/else are available
 *       use "elif" in place of "elifdef" and "elifndef"
 * 
 */
import scala.collection.mutable

  class ScalaPPDSLv2_CStyle {
    val storage = new mutable.HashMap[Symbol, Any]
    val boolStack = new scala.collection.mutable.Stack[Int]
    /*
     * 0 - if/elif HAS YET TO TAKE BRANCH - if
     * 1 - if/elif HAS TAKEN BRANCH - if
     * 2 - if/elif HAS YET TO TAKE BRANCH - ifdef
     * 3 - if/elif HAS TAKEN BRANCH - ifdef
     * 4 - if/elif HAS YET TO TAKE BRANCH - ifndef
     * 5 - if/elif HAS TAKEN BRANCH - ifndef
     * 6 - endif ONLY
     */
    case class consumeSymbol(s: Symbol) {
        def ?() = storage(s) // have to cast to what type they want
        def ?(a1:Any) = storage(s).asInstanceOf[(Any)=>Any] (a1)
        def ?(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Any] (a1, a2)
        def ?(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Any] (a1, a2, a3)
        def ?(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Any] (a1, a2, a3, a4)
        def ?(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Any] (a1, a2, a3, a4, a5)
        def ?(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Any] (a1, a2, a3, a4, a5, a6)
        
        def INT() = storage(s).asInstanceOf[Int]
        def INT(a1:Any) = storage(s).asInstanceOf[(Any)=>Int] (a1)
        def INT(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Int] (a1, a2)
        def INT(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Int] (a1, a2, a3)
        def INT(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Int] (a1, a2, a3, a4)
        def INT(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Int] (a1, a2, a3, a4, a5)
        def INT(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Int] (a1, a2, a3, a4, a5, a6)
        
        def LONG() = storage(s).asInstanceOf[Long]
        def LONG(a1:Any) = storage(s).asInstanceOf[(Any)=>Long] (a1)
        def LONG(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Long] (a1, a2)
        def LONG(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Long] (a1, a2, a3)
        def LONG(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Long] (a1, a2, a3, a4)
        def LONG(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Long] (a1, a2, a3, a4, a5)
        def LONG(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Long] (a1, a2, a3, a4, a5, a6)
        
        def DOUBLE() = storage(s).asInstanceOf[Double]
        def DOUBLE(a1:Any) = storage(s).asInstanceOf[(Any)=>Double] (a1)
        def DOUBLE(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Double] (a1, a2)
        def DOUBLE(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Double] (a1, a2, a3)
        def DOUBLE(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Double] (a1, a2, a3, a4)
        def DOUBLE(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Double] (a1, a2, a3, a4, a5)
        def DOUBLE(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Double] (a1, a2, a3, a4, a5, a6)
        
        def STRING() = storage(s).asInstanceOf[String]
        def STRING(a1:Any) = storage(s).asInstanceOf[(Any)=>String] (a1)
        def STRING(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>String] (a1, a2)
        def STRING(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>String] (a1, a2, a3)
        def STRING(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>String] (a1, a2, a3, a4)
        def STRING(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>String] (a1, a2, a3, a4, a5)
        def STRING(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>String] (a1, a2, a3, a4, a5, a6)
        
        def CHAR() = storage(s).asInstanceOf[Char]
        def CHAR(a1:Any) = storage(s).asInstanceOf[(Any)=>Char] (a1)
        def CHAR(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Char] (a1, a2)
        def CHAR(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Char] (a1, a2, a3)
        def CHAR(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Char] (a1, a2, a3, a4)
        def CHAR(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Char] (a1, a2, a3, a4, a5)
        def CHAR(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Char] (a1, a2, a3, a4, a5, a6)
        
        def BOOL() = storage(s).asInstanceOf[Boolean]
        def BOOL(a1:Any) = storage(s).asInstanceOf[(Any)=>Boolean] (a1)
        def BOOL(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Boolean] (a1, a2)
        def BOOL(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Boolean] (a1, a2, a3)
        def BOOL(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Boolean] (a1, a2, a3, a4)
        def BOOL(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Boolean] (a1, a2, a3, a4, a5)
        def BOOL(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Boolean] (a1, a2, a3, a4, a5, a6)
    }
    
    class preprocesses(s:Symbol) {
        var tempSymb: Symbol = s;
        object asInstances {  
            def as(a:Any) = {////functions must be in (), functions have max of 6 arguments
                storage.put(tempSymb, a);
            }
        }
        class thenClass(b:Boolean, c:Boolean, t:Int) {
            val bool = b
            val accum = c
            val typ = t
            def then(fn:()=>Any) = {
                if (bool && !accum){
                    fn()
                }
                if (bool || accum)
                {
                    boolStack.push(t + 1)
                }
                else
                {
                    boolStack.push(t)
                }
            }
        }
        def define(x:Symbol) = {
            tempSymb = x
            asInstances
        }
        def іf(fn:Boolean) = {/////////U+0456 is "і"
            new thenClass(fn, false, 0)
        }
        def ifdef(x:Symbol) = {
            new thenClass(storage.contains(x), false, 2)
        }
        def ifndef(x:Symbol) = {
            new thenClass(!storage.contains(x), false, 4)
        }
        def elif(ab: Boolean) = {
            if(boolStack.isEmpty){
                throw new Error("Cannot call preprocessor \"elif\" without calling preprocessor \"if\"")
            }
            var tmp = boolStack.pop();
            if (tmp >= 2 || tmp < 0)
                throw new Error("Cannot call preprocessor \"elif\" after preprocessor \"else!\"")
            new thenClass(ab, tmp == 1, 0)
        }
        def elif(x:Symbol) = {
            if(boolStack.isEmpty){
                throw new Error("Cannot call preprocessor \"elif\" without calling preprocessor \"if\"")
            }
            var tmp = boolStack.pop();
            var nxt:Boolean = storage.contains(x)
            if (tmp >= 6 || tmp < 2)
                throw new Error("Cannot call preprocessor \"elif\" after preprocessor \"else!\"")
            var t = 2
            if (tmp >= 4){
                nxt = !nxt;
                tmp = tmp - 2
                t = 4
            }
            new thenClass(nxt, tmp == 3, t)
        }
        def еlsе(fn:()=>Any) = {//////////U+0435 is "е"
            if(boolStack.isEmpty){
                throw new Error("Cannot call preprocessor \"else\" without calling preprocessor \"if\"")
            }
            var tmp = boolStack.pop();
            if (tmp >= 6 || tmp < 0)
                throw new Error("Cannot call preprocessor \"else\" after preprocessor \"else!\"")
            if (tmp%2 == 0){
                fn()
            }
            boolStack.push(6)
        }

        def endif() = {
            if(boolStack.isEmpty){
                throw new Error("Cannot call preprocessor \"endif\" without calling preprocessor \"if\"")
            }
            boolStack.pop()
        }

        def undefine(x:Symbol) = {
           storage.remove(x)
        }
        def warning(s:String) = {
            System.err.println(s);
        }
        def error(s:String) = {
            throw new Error(s)
        }
    }
    
    var ### =  new preprocesses('_)
    def __defined__(s:Symbol)=storage.contains(s)/////////////calls must use ()
    implicit def symbol2print(s:Symbol) = consumeSymbol(s)
    implicit def sym2int(s: Symbol) = storage(s).asInstanceOf[Int]
    implicit def sym2long(s: Symbol) = storage(s).asInstanceOf[Long]
    implicit def sym2double(s: Symbol) = storage(s).asInstanceOf[Double]
    implicit def sym2string(s: Symbol) = storage(s).asInstanceOf[String]
    implicit def sym2bool(s: Symbol) = storage(s).asInstanceOf[Boolean]
    implicit def sym2char(s: Symbol) = storage(s).asInstanceOf[Char]
 }
