/*
 * "C Preprocessor-like" DSL for Scala
 * 
 * Derek Hudson
 * Thomas Chenette
 * Matthew Chenette
 * 
 * CS345 - Assignment 5
 * 
 * 
 * Note: to change the functionality of the "preprocessor" change what PPTestC extends
 * 
 */

object PPTestC extends ScalaPPDSL_v2_C_Style{
    def self(i:Double) = {
       i 
    }
    /*def self(i:Int) = {
        i
    }*/
    def main(args:Array[String]) = {
        ### define 'x as 100.0
        ### define 'fun as ((x:Int, y:Int)=>{x>y})
        
        ### ifdef 'y then (()=>{println("y defined")})
        ### elif 'x then (()=>{println("x defined")})
        ### endif
        
        ### define 'y as ('x ?)
       
        ### іf (('y DOUBLE)>5.0) then (()=>{
            ### іf (('y DOUBLE)<100.0) then (()=>println("y < 100 and y > 5"))
            ### еlsе (()=>println("y >= 100"))
            ### endif
        })
       ### elif (('y DOUBLE)<5.0) then (()=>{println("y < 5")})
       ### еlsе (()=>{println("y == 5")})
       ### endif
        
        var y:Double = 'x;
        println(y);
        self('x)
        println(self('x))
        
        ### warning "println(Symbol) is an ambiguous call"
        println('x)
        println('x DOUBLE)
        //### error "This is a test error."
    }
}
