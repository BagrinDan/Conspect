
    > База:
        df.head() : # Первые 5 строк
        df.shape : # строки и колонки
        df.size : # всего элементов

        df.info()
        df.dtypes : # типы данных
        df.column : # Названия колонок

    > Пропуски
        df.isnull().sum() 
        df[df.isnull().any(axis=1)].head(10) : # Показывает строки в которых есть пропуски

        df.isna().sum()
        df.isnull().mean()

        df.describe()
        df.describe(include='all')

        df.duplicated().sum()
        df.drop_duplicates()

        df['Item'].unique()

    