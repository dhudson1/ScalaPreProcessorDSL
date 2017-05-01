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
 * Note: to change the functionality of the "peprocessor" change what PPTest extends
 * 
 */

object PPTest_C extends ScalaPPDSL_v2_C_Style{
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
        
        ### ifndef 'y then (()=>{println("y notdefined")})
        ### elif 'x then (()=>{println("x notdefined")})
        ### еlsе (()=>{println("else")})
        ### endif
        
        ### іf ('y DOUBLE)>5.0 then (()=>{
            ### define 'z as "string z"
            println('z STRING)
       })
       ### elif ('fun BOOL (2, 1)) then (()=>{println("hi2")})
       ### еlsе (()=>{println("hi3")})
       ### endif
       
       ### іf (('y DOUBLE)>5.0) then (()=>{
         ### іf (('y DOUBLE)<100.0) then (()=>println("y < 100"))
         ### еlsе (()=>println("y >= 100"))
         ### endif
       })
       ### elif (('y DOUBLE)<5.0) then (()=>{println("y < 5")})
       ### еlsе (()=>{println("y == 5")})
       ### endif
        
        var yy:Double = 'x;
        println(yy);
        self('x)
        println(self('x))
        
        ### warning "println(Symbol) is an ambiguous call"
        println('x)
        println('x DOUBLE)
        //### error "This is a test error."
        
        ()
    }
}