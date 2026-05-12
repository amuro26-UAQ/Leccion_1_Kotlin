pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Leccion_1_Kotlin"
include(":app")
include(":leccion1")
include(":Leccion_2")
include(":Lambdas_y_funciones_de_orden_superior")
include(":Leccion_3")
include(":Modelado_AnimalesFrutas")
include(":Registro_simple_de_usuarios")
