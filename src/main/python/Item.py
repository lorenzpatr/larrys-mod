import json
import os


"""
Creates JSON for assets/[MOD_NAME]/models if nonexistent.
Fills it with standard input.
@file_path = path to json file with name
@file_name = name of json file
"""
def create_json_models(file_path, file_name):
    data = {
        "parent": "minecraft:item/generated",
        "textures": {
            "layer0": f"larrys-mod:item/{file_name.split('.')[0]}",
        }
    }

    try:
        with open(file_path, "w", encoding="utf-8") as f:
            # indent=2 oder 4 sorgt für die Minecraft-typische Formatierung
            json.dump(data, f, indent=2)
        print(f"JSON file created : {file_path}")
        print("File not in Git!!")
    except IOError as e:
        print(f"Error: {e}")

"""
Checks if name exists in json file
@file_path = path to json file with name
@technical_name = name of object to find
"""
def check_if_named(file_path, technical_name):
    try:
        with open(file_path, "r", encoding="utf-8") as f:
            lang_data = json.load(f)
            return f"item.larrys-mod.{technical_name}" in lang_data
    except FileNotFoundError:
        return False


def add_translation(file_path, item_name, display_name):
    if os.path.exists(file_path):
        with open(file_path, "r", encoding="utf-8") as f:
            try:
                data = json.load(f)
            except json.JSONDecodeError:
                print(f"File {file_path} does not exist 1")
                return 0
    else:
        print(f"File {file_path} does not exist 2")
        return 0

    key = f"item.larrys-mod.{item_name}"
    data[key] = display_name

    if not check_if_named(file_path, item_name):
        with open(file_path, "w", encoding="utf-8") as f:
            json.dump(data, f, indent=2, ensure_ascii=False)
        print(f"Translation added for: '{key}': '{display_name}'")
        return 1
    else:
        print(f"Translation already exists: '{key}': '{display_name}'")
        return 1

class Item:

    def __init__(self, name, display_name,description):
        self.name = name
        self.display_name = display_name
        self.description = description
        self.image_url = name+".png"
        self.create_json_file("C:\\Users\\patri\\Downloads\\template-mod-template-1.21 (1)\\src\\main\\resources\\assets\\larrys-mod\\")

    def create_json_file(self, resource_path):
        lang = resource_path + "lang\\en_us.json"
        models = resource_path + "models/item/"
        textures = resource_path + "textures/item/"
        file_name = f"{self.name}.json"
        error_counter = 0

        print("--------------------------------------------")
        print(f"ITEM CREATON {self.name}")
        print("--------------------------------------------")
        print(f"Resource path is {resource_path}")
        print(f"Creating json files for {self.name} ...")
        if os.path.isfile(models + file_name):
            print("Model file exists")
        else:
            create_json_models(models + file_name, file_name)

        if os.path.isfile(lang):
            add_translation(lang, self.name, self.display_name)
        else:
            print("Translation file doesn't exists")
            error_counter += 1

        if os.path.isfile(f"{textures}{self.name}.png"):
            print(f"Texture file for {textures}{self.name}.png exists")
        else:
            print(f"Texture file for {textures}{self.name}.png doesn't exist")
            print("ADD TEXTURES YOURSELF")
            error_counter += 1

        if error_counter > 0:
            print('\033[93m' + "WARNING: Item not completed" + '\033[0m')
        else:
            print('\033[92m' + "GOOD JOB: Everything is perfect" + '\033[0m')


def main():
    print("python main function: entry point when run directly")
    forke = Item("forke", "Forke", "")
    solarisIngot = Item("solaris_ingot", "Solaris Ingot", "")
    solarisOre = Item("solaris_ore", "Solaris Ore", "")


if __name__ == "__main__":
    main()
