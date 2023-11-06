package com.cmac.aprendendocompose.components

//@Composable
//fun ProductItem(withDescription: Boolean = false, content: String? = null) {
//    if (withDescription) {
//        if (content != null) {
//            ProductItemWithDescription(content)
//        }
//    } else {
//        ProductItemWithoutDescription()
//    }
//}
//
//@Composable
//fun ProductItemWithDescription(content: String) {
//    Surface(shadowElevation = 10.dp, shape = RoundedCornerShape(15.dp)) {
//        Column(
//            modifier = Modifier
//                .height(250.dp)
//                .widthIn(200.dp, 210.dp)
//                .verticalScroll(rememberScrollState())
//
//        ) {
//            val size = 100.dp
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(size)
//                    .background(
//                        brush = Brush.horizontalGradient(
//                            colors = listOf(
//                                Purple500,
//                                Teal200
//                            )
//                        )
//                    )
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .size(size)
//                        .offset(y = size / 2)
//                        .clip(shape = CircleShape)
//                        .align(Alignment.BottomCenter)
//                )
//            }
//            Spacer(modifier = Modifier.height(size / 2))
//            Column() {
//                Text(
//                    text = LoremIpsum(50).values.first(),
//                    fontSize = 18.sp,
//                    fontWeight = FontWeight.Bold,
//                    maxLines = 2,
//                    overflow = TextOverflow.Ellipsis,
//                    modifier = Modifier.padding(horizontal = 16.dp)
//                )
//                Text(
//                    text = "R$14.99",
//                    fontSize = 14.sp,
//                    fontWeight = FontWeight(400),
//                    modifier = Modifier.padding(
//                        start = 16.dp,
//                        end = 16.dp,
//                        top = 8.dp,
//                        bottom = 18.dp
//                    )
//                )
//                Column(modifier = Modifier
//                    .background(Purple500)
//                    .fillMaxWidth()) {
//                    Text(
//                        text = content,
//                        modifier = Modifier.padding(16.dp),
//                        fontSize = 18.sp,
//                        color = Color.White
//                    )
//                }
//            }
//        }
//
//    }
//}
//
//
//@Composable
//fun ProductItemWithoutDescription() {
//    Surface(shadowElevation = 10.dp, shape = RoundedCornerShape(15.dp)) {
//        Column(
//            modifier = Modifier
//                .heightIn(250.dp, 300.dp)
//                .widthIn(200.dp, 210.dp)
//
//        ) {
//            val size = 100.dp
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(size)
//                    .background(
//                        brush = Brush.horizontalGradient(
//                            colors = listOf(
//                                Purple500,
//                                Teal200
//                            )
//                        )
//                    )
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .size(size)
//                        .offset(y = size / 2)
//                        .clip(shape = CircleShape)
//                        .align(Alignment.BottomCenter)
//                )
//            }
//            Spacer(modifier = Modifier.height(size / 2))
//            Column(modifier = Modifier.padding(16.dp)) {
//                Text(
//                    text = LoremIpsum(50).values.first(),
//                    fontSize = 18.sp,
//                    fontWeight = FontWeight.Bold,
//                    maxLines = 2,
//                    overflow = TextOverflow.Ellipsis,
//
//                    )
//                Text(
//                    text = "R$14.99",
//                    fontSize = 14.sp,
//                    fontWeight = FontWeight(400),
//                    modifier = Modifier.padding(top = 8.dp)
//                )
//            }
//        }
//    }
//}


//@Preview(showBackground = true)
//@Composable
//fun ProductItem2() {
//    Surface(
//        modifier = Modifier.padding(8.dp),
//        shape = RoundedCornerShape(15.dp),
//        shadowElevation = 4.dp
//
//    ) {
//        Row (modifier = Modifier
//            .height(250.dp)
//            .width(500.dp)  ) {
//            val imageSize = 100.dp
//            Box(modifier = Modifier
////                .height(imageSize)
//                .fillMaxHeight()
//                .background(brush = Brush.linearGradient(colors = listOf(Purple500, PurpleGrey80)))
//            ) {
//                val rainbowColorsBrush = remember {
//                    Brush.linearGradient(
//                        listOf(
//                            PurpleGrey80,
//                            Purple500,
//                        )
//                    )
//                }
//                Image(
//                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                    contentDescription = "Imagem do item",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .size(imageSize)
//                        .offset(x = imageSize / 2)
//                        .clip(CircleShape)
//                        .border(BorderStroke(4.dp, rainbowColorsBrush), CircleShape )
//                        .align(Center)
//                )
//            }
//            Spacer(modifier = Modifier.width(imageSize/2))
//
//            Column(Modifier.align(CenterVertically) .padding(16.dp)) {
//                Text(
//                    text = LoremIpsum(50).values.first(),
//                    fontSize = 18.sp,
//                    maxLines = 6,
//                    overflow = TextOverflow.Ellipsis,
//
//                    )
//            }
//
//
//
//        }
//    }
//
//}