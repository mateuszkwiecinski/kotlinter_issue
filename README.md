# kotlinter_issue
Sample project for https://github.com/jeremymailen/kotlinter-gradle/issues/99

Run `./gradlew lintKotlin --rerun-task`

Output
```
Execution failed for task ':quick:lintKotlinMain'.
> There was a failure while executing work items
   > A failure occurred while executing org.jmailen.gradle.kotlinter.tasks.lint.LintWorkerRunnable
      > com.pinterest.ktlint.core.RuleSetProvider: Provider com.pinterest.ktlint.ruleset.standard.StandardRuleSetProvider not a subtype
```
