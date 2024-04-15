import numpy as np

arr=np.array([1, 2, 3, 4, 5])
condition = arr>2

new_value=-1

arr=np.where(condition,new_value,arr)
print(arr)