# Robustness Diagrams — AddItem and RemoveItem

Files:

- [diagrams/robustness_additem.puml](diagrams/robustness_additem.puml)
- [diagrams/robustness_removeitem.puml](diagrams/robustness_removeitem.puml)

Purpose:

- These PlantUML files show robustness diagrams for the `addItem` and `removeItem` use cases. Elements are labeled with stereotypes: `<<boundary>>`, `<<control>>`, and `<<entity>>`.

Rendering:

1. Install PlantUML or use a VS Code PlantUML extension.
2. From repo `src` folder, render with PlantUML jar (example):

```bash
cd "c:/Users/Haidang7320/Documents/NetBeansProjects/LibaryManager/src"
java -jar path/to/plantuml.jar diagrams/robustness_additem.puml
java -jar path/to/plantuml.jar diagrams/robustness_removeitem.puml
```

Or use the VS Code PlantUML preview and export to PNG/SVG.

Notes:

- The diagrams map to these classes in the codebase: `boundary/AddItemBoundary.java`, `control/AddItemController.java`, `dao/LibraryItemDAO.java`, and `db/fakedb.java`.
- Adjust the PlantUML files if you want different layout or extra details.
