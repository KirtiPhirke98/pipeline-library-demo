package com.test.demo
import java.io.File 
String filepath="Hello.csv"
File myfile=new File(filepath)
println myfile.text

def list=myfile.collect { it }
println "list: $list"

def lines=myfile.readLines()
println "line: $lines"
