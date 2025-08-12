# Keep Kotlin metadata
-keepclassmembers class kotlin.Metadata { *; }
# Keep signal protocol classes (adjust package if needed)
-keep class org.whispersystems.** { *; }
-keepclassmembers class org.whispersystems.** { *; }
