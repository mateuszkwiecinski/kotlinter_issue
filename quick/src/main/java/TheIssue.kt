class TheIssue : JavaMiddleAbstractClass<String>(), KotlinInterface<String>

interface KotlinInterface<T> {
    val value: T?
}
