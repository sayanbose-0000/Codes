import numpy as np

arr1=np.array([1, 2, 3, 4, 5])
condition = arr1>2

new_value=-1

arr2=np.copy(arr1)

arr2=np.where(condition,new_value,arr2)
print(arr1)
print(arr2)