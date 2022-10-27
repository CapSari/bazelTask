package(
    default_visibility = ["//src:__subpackages__"],
)

android_library(
    name = "greeter_activity",
    srcs = [
        "Greeter.java",
        "MainActivity.java",
        "GreetViewModel.java",
    ],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
     deps = [
             "@maven//:androidx_appcompat_appcompat",
             "@maven//:androidx_core_core",
             "@maven//:androidx_core_core_ktx",
             "@maven//:androidx_drawerlayout_drawerlayout",
             "@maven//:androidx_fragment_fragment",
             "@maven//:androidx_lifecycle_lifecycle_common",
             "@maven//:androidx_lifecycle_lifecycle_viewmodel",
             "@maven//:com_google_android_material_material",
             "@maven//:androidx_lifecycle_lifecycle-livedata",
             "@maven//:com_android_support_cardview-v7",
             "@maven//:com_android_support_design",
             "@maven//:android_arch_lifecycle_extensions",

        ],

)