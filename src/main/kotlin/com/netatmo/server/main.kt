package com.netatmo.server

import spark.Spark.*

fun main(args: Array<String>) {
  println("Hello World")
  get("/", {res, rep -> "Hello world !!"})
}
