1. MinMaxScalling
2. Resize (Если изображения слишком большое)
3. Обучения модели
4. Валидация 

1. Методы применяемы к датасету:
	shuffle(weight), где weight = dataset_lenght * data_weight << RAM
	take()
	skip()


========================
	Pipeline
========================
Итоговый правильный алгоритм:
    Load (Загрузка).
    Pad & Resize (Приведение к единому размеру).
    Augment (Случайные трансформации — только для train).
    Rescale/Normalize (Превращение пикселей в маленькие числа типа 0.0...1.0).
    Shuffle & Batch (Перемешивание и разбивка на группы).



=========================
	Код
=========================

**************************
**  Данные для обучения **
**************************

train_path = '/content/drive/MyDrive/Lab8/Lab8Data/train'

img_size = (128, 128) // В примере изображения имели размер 5000x4000, поэтому уменьшаем их для экономии ресурсов
batch_size = 32

# Insert train dataset
train_dataset = tf.keras.utils.image_dataset_from_directory(
    train_path,
    shuffle=True, // Нужно чтобы изображения не попадали целиком по очеряди
    image_size=img_size, // Выбираем размер который попадет к модели
    batch_size=batch_size
}

** Если у нас один большой датасет, то делим его через train_test_split:

	[1]
	80% ==> training, 10% Valid, 10% Test

	1. train_size = 0.8
	   len(dataset)*train_size
	
	2. train_ds = dataset.take(n) -> n = 80%		

	3. test_ds = dataset.skip(n) 

	4. val_size = 0.1
	   len(dataset) * val_size
	
	5. val_ds = test_ds.take(m) -> m = 10%

	6. test_ds = test_ds.skip(m)


	[2]
	** Валидация + тест
	train_x, temp_x, train_y, temp_y = train_test_split(X, y, test_size=0.2, random_state=42)
	

	** Длеим пополам
	valid_x, test_x, valid_x, test_y = tran_test_split(temp_x, temp_y, test_size=0.5, random_state=42)
