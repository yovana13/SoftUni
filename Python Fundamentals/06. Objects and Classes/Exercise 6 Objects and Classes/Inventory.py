class Inventory:
    def __init__(self, capacity):
        self.__capacity = capacity
        self.starting_capacity = capacity
        self.list = []

    def add_item(self, item):
        if self.__capacity != 0:
            self.list.append(item)
            self.__capacity -= 1
        else:
            return f"not enough room in the inventory"

    def get_capacity(self):
        return self.starting_capacity

    def __repr__(self):
        ret_list = ", ".join(self.list)
        return f"Items: {ret_list}.\nCapacity left: {self.__capacity}"


inventory = Inventory(2)
inventory.add_item("potion")
inventory.add_item("sword")
print(inventory.add_item("bottle"))
print(inventory.get_capacity())
print(inventory)
