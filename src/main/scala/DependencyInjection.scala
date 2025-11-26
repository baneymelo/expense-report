
class DependencyInjection {

    def run(): Unit = {
        val report: IReport = new Report()
        report.create()
    }
}

