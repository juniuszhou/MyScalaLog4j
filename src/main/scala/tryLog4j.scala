import org.slf4j.LoggerFactory

//.LoggerFactory

/**
 * Created by juzhou on 5/22/2015.
 */
object tryLog4j {
  def main (args: Array[String]) {
    val log = LoggerFactory.getLogger(tryLog4j.getClass)
    log.info("log4j information.")
    log.error("stackoverflow", " happened.")
    println("hello world")
  }
}