        package com.company;

        public class Book extends Production implements Cloneable{
            /**
             * ISBN
             */
            private int isbn;

            /**
             * 価格
             */
            private int price = 250;

            /**
             * ISBNのマスター
             */
            private static int master_isbn = 1;

            // コンストラクタ
            public Book (String title, String author, int price) {
                super(title,"",  author, "");
                this.price = price;
                this.isbn = master_isbn++;
            }

            public int getIsbn() {
                return isbn;
            }

            public static int getMaster_isbn() {
                return master_isbn;
            }

            public int getPrice() {
                return price;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            @Override
            public String toString() {
                return String.format("ISBN%04d",isbn) + "　" +super.getTitle() + " " + super.getAuthor() + " ¥" + price + "-";
            }

            // 問題5_3
            @Override
            public boolean equals(Object object) {
                if (object == null) {
                    return false;
                }

                if (this == object) {
                    return true;
                }

                if (this.getClass() != object.getClass()) {
                    return false;
                }

                Book book = (Book)object;
                return title.equals(book.title)
                        && author.equals(book.author)
                        && price == book.price
                        && isbn == book.isbn;
            }

            // 問題5_3
            @Override
            public int hashCode() {
                return this.title.hashCode();
            }

            @Override
            // 問題5_1
            public Book clone() {
                Book cloned = null;
                try {
                    cloned = (Book) super.clone();
                    cloned.setAuthor(this.getAuthor());
                    cloned.setTitle(this.getTitle());
                    cloned.setPrice(this.price);
                } catch(Exception e) {
                    e.printStackTrace();
                }

                return cloned;
            }
        }
