@main def entryPoint(): Unit = {
  println("Starting the program...")
  /*
  val dependencyInjection = DependencyInjection.builder.build()
  val handler = dependencyInjection.createHan()
  handler.run()
  */
  val di = DependencyInjection()
  di.run()
}