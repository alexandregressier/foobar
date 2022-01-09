import FooBarShared
import SwiftUI

@main
struct FooBarApp: App {
    var body: some Scene {
        WindowGroup {
            TabView {
                FooView()
                    .tabItem {
                        Label("Foo", systemImage: "star")
                    }
                BarView()
                    .tabItem {
                        Label("Bar", systemImage: "heart")
                    }
            }
        }
    }
}
