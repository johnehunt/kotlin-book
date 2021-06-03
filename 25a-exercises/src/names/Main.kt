package names

fun main() {
    // Set up sets
    val exam = setOf("Andrew", "Kirsty", "Beth", "Emily", "Sue")
    val project = setOf("Kirsty", "Emily", "Ian", "Stuart")

    // Output the basic sets
    println("exam: $exam")
    println("project: $project")

    // Intersection
    val intersection = exam intersect project
    println("Students who took both the exam and the project $intersection")

    val examOnly = exam subtract project
    println("Students only took the exam $examOnly")

    val projectOnly = project subtract exam
    println("Students only took the project $projectOnly")

    // Union of two sets
    val union = exam + project
    println("Students who took either (or both) of the exam and the project $union")

}